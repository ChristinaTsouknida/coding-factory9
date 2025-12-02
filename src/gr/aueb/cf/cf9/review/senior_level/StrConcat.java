package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class StrConcat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        String message = "";

        System.out.println("Please enter your first name");
        name = scanner.nextLine();

        System.out.println("Please enter your age");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a number");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        message = getMessage(name, age);

        System.out.println(message);
    }

    public static String getMessage(String name, int age) {
        return String.format("Hello my name is %s and I am %d years old", name, age);

    }
}
