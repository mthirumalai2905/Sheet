package Arrays;

import java.util.Random;

public class RandomArrayExample {
    public static void main(String[] args) {
        int[] randomNumbers = new int[6];

        Random rand = new Random();

        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = rand.nextInt(6);
        }

        // Print the array
        for(int number : randomNumbers) {
            System.out.println(number);
        }
    }
}
