public class FindRowWithMaximumOne {
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,1,1,1},
            {0,0,0,0,0},
            {0,1,1,1,1},
            {0,0,0,0,0},
            {0,1,1,1,1}
        };

        int maxOnesRow = findMaxOnes(arr);
        System.out.println("Row with maximum number of 1s: " + maxOnesRow);

        int maxOnesRowUsingBinarySearch = findMaxOnesUsingBinarySearch(arr);
        System.out.println("Row with maximum number of 1s (using binary search): " + maxOnesRowUsingBinarySearch);
    }

    public static int findMaxOnes(int[][] arr) {
        int maxOnesCount = -1;
        int maxOnesRow = -1;

        for (int i = 0; i < arr.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnesCount) {
                maxOnesCount = countOnes;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;
    }

    public static int findMaxOnesUsingBinarySearch(int[][] arr) {
        int maxOnesCount = -1;
        int maxOnesRow = -1;
        int cols = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            int index = firstOccurrenceOfOne(arr[i], 0, cols - 1);
            if (index != -1) {
                int countOnes = cols - index; // Number of 1s in this row
                if (countOnes > maxOnesCount) {
                    maxOnesCount = countOnes;
                    maxOnesRow = i;
                }
            }
        }

        return maxOnesRow;
    }

    private static int firstOccurrenceOfOne(int[] row, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1 && (mid == 0 || row[mid - 1] == 0)) {
                return mid;
            } else if (row[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
