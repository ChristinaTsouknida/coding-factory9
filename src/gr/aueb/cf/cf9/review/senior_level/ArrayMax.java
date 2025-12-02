package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Finds and return the max position of the array
 */
public class ArrayMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        System.out.println("Please enter five integers");
        for (int i = 0; i < numbers.length; i++) {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();

        }

        maxPosition = getMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        System.out.printf("The maximum position is %d and the max value is %d%n", (maxPosition + 1), maxValue);
    }

    /**
     * Returns the max position of an array
     * @param arr the arrau
     * @return the position of the maximum value
     */
    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;

        int maxPosition = 0;
        int maxValue = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }


}
