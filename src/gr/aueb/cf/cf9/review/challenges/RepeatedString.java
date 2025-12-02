package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        int numberOfTimes = 0;

        System.out.println("Please gives us the string and the number of times you want to repeat");
        s1 = scanner.nextLine();
        numberOfTimes = scanner.nextInt();
        System.out.println(getString(s1, numberOfTimes));
    }

    public static String getString(String s1, int times) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < times; i++) {
//            sb.append(s1);
//        }
//        return sb.toString();

        return s1.repeat(times);
    }
}
