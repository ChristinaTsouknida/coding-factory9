package gr.aueb.cf.cf9.ch7;

public class ReversedStrApp {

    public static void main(String[] args) {
        String str = "Athens";

        str = reverse2(str);
        System.out.println(str);
    }

    public static String getReversed(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
