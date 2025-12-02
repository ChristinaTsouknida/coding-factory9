package gr.aueb.cf.cf9.ch7;

/**
 * Μετατρέπει σε Lower και σε Upper case.
 */
public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        boolean isEqual = s1.toUpperCase().equals(s2.toUpperCase());
        System.out.println(isEqual);

        boolean isEqual2 = s1.toLowerCase().equals(s2.toLowerCase());
        System.out.println(isEqual2);
    }
}
