package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * When the user iserts -1 the while loop will stop.
 */
public class IterationCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int iterations = 0;

        System.out.println("Please enter a number: ");
        number = scanner.nextInt();

        while (number != -1) {
            iterations ++;
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
        }

        System.out.println("The count of iterations is: " + iterations);
    }
}
