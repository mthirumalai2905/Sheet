package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int longestStreak = findLongestConsecutiveSequence(arr);
        System.out.println("Longest Conseqcutive sequence length: " + longestStreak);
    }

    public static int findLongestConsecutiveSequence(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int max = 0;

        for(int num : set){

            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}
