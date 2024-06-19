package Heaps;

import java.util.*;

public class KclosestNumbers {
    public static List<Integer> findKClosestNumbers(int[] nums, int target, int k) {
        // A max-heap to store the closest numbers with their distance from the target
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
        
        for (int num : nums) {
            int distance = Math.abs(num - target);
            if (maxHeap.size() < k) {
                maxHeap.offer(new int[]{distance, num});
            } else if (distance < maxHeap.peek()[0]) {
                maxHeap.poll();
                maxHeap.offer(new int[]{distance, num});
            }
        }
        
        // Extract the numbers from the heap
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll()[1]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int k = 3;

        List<Integer> closestNumbers = findKClosestNumbers(nums, target, k);
        System.out.println("The " + k + " closest numbers to " + target + " are: " + closestNumbers);
    }
}
