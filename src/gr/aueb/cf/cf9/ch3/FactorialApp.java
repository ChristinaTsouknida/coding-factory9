package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Caulculates factorial of a number.
 * n! = 1 * 2 * 3 * ... * n
 * for instance, 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ είσαγετε έναν αριθμό");
        number = scanner.nextInt();

        while (i <= number) {
            result *= i;
            i++;

        }
        System.out.printf("%d! = %d%n", number, result);



    }
}
