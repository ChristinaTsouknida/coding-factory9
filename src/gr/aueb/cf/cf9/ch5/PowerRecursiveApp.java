package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

        int result = 0;
        int base = 5;
        int exp = 3;

        result = powerRecursive(base, exp);

        System.out.println("result = " + result);
    }

    public static int powerRecursive(int base, int power) {
        return power == 0 ? 1 : base * powerRecursive(base, power - 1);
    }
}
