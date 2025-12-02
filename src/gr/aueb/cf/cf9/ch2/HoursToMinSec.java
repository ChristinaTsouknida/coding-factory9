package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * calculates hour to minutes and seconds for a given number of hours.
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 3600;

        // Εντολές
        // Πάρε input από την χρήστη
        System.out.println("Παρακαλώ εισάγετε τι ώρα είναι:");
        hours = scanner.nextInt();

        // Επεξεργάσου το input
        minutes = hours * MINUTES_PER_HOUR;
        seconds = hours * SECONDS_PER_HOUR;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf(Locale.US,"Το νούμερο των λεπτών είναι: %,d%n ", minutes);
        System.out.printf(Locale.forLanguageTag("el"),"Το νούμερο των δευτερολέπτων είναι: %,d%n" , seconds);
    }
}
