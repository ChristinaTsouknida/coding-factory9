package gr.aueb.cf.cf9.ch7;

/**
 * formatting primitives to strings.
 */
public class StrFormat {

    public static void main(String[] args) {
        char row = 'B';
        int column = 1;

        String seat = String.format("%c%02d", row, column);
        System.out.println(seat);
    }
}
