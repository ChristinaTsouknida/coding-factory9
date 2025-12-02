package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο Χρήστης προσπαθεί να μαντέψει ένα Secret number.
 */
public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_NUMBER = 42;
        int num = 0;

        while (true){
            System.out.println("Please guess the secret number: ");
            num = scanner.nextInt();

  //          if (num == SECRET_NUMBER) {
   //             System.out.println("You guessed the secret number!");
   //             break;
   //         } else {
   //             System.out.println("Try again");
    //        }

            if (num != SECRET_NUMBER) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("You guessed the secret number!");
            break;
        }
    }
}
