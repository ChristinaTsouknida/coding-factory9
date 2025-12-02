package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please provide the base and the power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = powerCalc(base, power);
        System.out.printf("The result of %d ^ %d = %d", base, power, result);
    }

    public static int powerCalc(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }
}
