package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολιγίζει το απόλυτο ενός ακεραίου με την χρήση του τριαδικού τελεστή
 * Το απόλυτο ενός ακεραίου είναι θετικός αριθμός. Για παράδειγμα το απόλυτο
 * του -5 είναι 5 και το απόλυτο του 5 είναι 5.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Παρακαλούμε εισάγετε έναν αριθμό");
        num = scanner.nextInt();

//        if (num >= 0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        abs = (num >= 0) ? num : -num;
    }
}
