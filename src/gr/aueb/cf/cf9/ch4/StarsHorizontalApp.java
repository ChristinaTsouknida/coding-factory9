package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει 10 οριζόντια αστεράκια με for
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {


        int count = 0;
        //Horizontal Stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        //Vertical stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
        // grid 10 X 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
