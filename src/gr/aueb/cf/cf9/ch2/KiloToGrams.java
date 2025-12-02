package gr.aueb.cf.cf9.ch2;
/**
 * ο χρήστης μας δίνει το βάρος του σε κιλά και
 * εμείς το μετατρέπουμε σε γραμμάρια
 */

import java.util.Scanner;

public class KiloToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int GRAMS_PER_KILO = 1000;
        int kilos = 0;
        int kilosInGrams = 0;

        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κιλά");
        kilos = scanner.nextInt();
        kilosInGrams = kilos * GRAMS_PER_KILO;

        System.out.printf("Το βάρος σε κιλά είναι %d, το βάρος σας σε γραμμάρια είναι %d%n", kilos, kilosInGrams);
    }
}
