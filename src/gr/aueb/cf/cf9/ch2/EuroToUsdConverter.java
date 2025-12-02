package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος) σε ευρώ
 * και το μετατρέπει σε δολλάρια ΗΠΑ με βάση μία ισοτιμία.
 * Για παράδειγμα αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 Euro = 99 USA cents,
 * τότε τα συνολικά USA cents είναι 9900 και αυτό ανιστοιχεί σε 99 USA Dollars.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CENTS_PER_EURO = 99;
        int inputEuro = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;


        System.out.println("Please give us an amount of euros");
        inputEuro = scanner.nextInt();
        totalUsaCents = inputEuro * CENTS_PER_EURO;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;


        System.out.printf("%d Euros = %d USD dollars and %d USD Cents %n", inputEuro, usaDollars, usaCents);
    }
}
