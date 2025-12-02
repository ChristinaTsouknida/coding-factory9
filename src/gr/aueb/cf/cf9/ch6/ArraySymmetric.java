package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός ή όχι.
 * Συμμετρικός είναι ένας πίνακας αν διαβάζεται το ίδιο από
 * την αρχή και από το τέλος.
 * Για παράδειγμα
 * [1, 2, 3, 3, 2, 1] είναι συμμετρικός
 * [1, 2, 3, 2, 1] είναι συμμετρικός
 */
public class ArraySymmetric {

    public static void main(String[] args) {



    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
        return true;

    }



}
