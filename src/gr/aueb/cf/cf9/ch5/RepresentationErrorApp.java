package gr.aueb.cf.cf9.ch5;

public class RepresentationErrorApp {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual = actual + 0.1;
        }
        System.out.println("actual: " + actual);
// ενώ συμφωνούν βγαίνει not equal! Δεν μπορούμε να συγκρίνουμε δεκαδικούς!
        if (actual == expected) {  //δεν μπορεί το διαδικό σύστημα να απαραστήσει όλους τους δεκαδικούς
            System.out.println("Equal!");
        } else {
            System.out.println("Not Equal!");
        }
    }
}
