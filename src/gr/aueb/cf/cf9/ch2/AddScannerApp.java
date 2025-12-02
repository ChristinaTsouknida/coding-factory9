package gr.aueb.cf.cf9.ch2;

//import java.util.*;     γίνεται μόνο του import αυτόματα και δεν το εμφανίζει
import java.util.Scanner;

/**
 * Διαβάζει 2 ακεραίους από το standard input (stdin) δλδ keyboard
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d%n" , num1, num2, sum);


    }
}
