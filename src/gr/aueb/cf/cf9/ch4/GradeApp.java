package gr.aueb.cf.cf9.ch4;
/**
 * Λαμβάνει έναν grade από τον χρήστη και ανάλογα την
 * βαθμολογική κλίμακα εμφανίζει κατάλληλο μήνυμα.
 */

import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Παρακαλούμε δώστε τον βαθμό");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από την βάση");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν Καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Ο βαθμός πρέπει να είναι μεταξύ από 1 έως 10");
                break;

        }

    }
}
