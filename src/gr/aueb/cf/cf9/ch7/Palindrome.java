package gr.aueb.cf.cf9.ch7;

/**
 * Παλινδρομική είναι μια πρόταση (String) που
 * διαβάζεται το ίδιο από την αρχή και
 * από το τέλος.
 */
public class Palindrome {

    public static void main(String[] args) {

    }

    public static boolean IsPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j-- ) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsPalindrome2(String str) {
//        return new StringBuilder(str).reverse().toString().toUpperCase().equals(str.toUpperCase());
//        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}
