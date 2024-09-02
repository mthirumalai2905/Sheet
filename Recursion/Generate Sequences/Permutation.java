public class Permutations {

    public static void generatePermutations(char[] arr, int currentIndex) {
        if (currentIndex == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = currentIndex; i < arr.length; i++) {
            swap(arr, currentIndex, i);
            generatePermutations(arr, currentIndex + 1);
            swap(arr, currentIndex, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String sequence = "12345";
        char[] arr = sequence.toCharArray();
        generatePermutations(arr, 0);
    }
}
