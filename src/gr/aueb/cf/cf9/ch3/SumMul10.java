package gr.aueb.cf.cf9.ch3;

/**
 * sum 0f 10 number from 1 to 10.
 */
public class SumMul10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int mul = 1;
        int j = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        while (j <= 10) {
            mul *= j;   //mul = mul * j;
            j++;
        }
        System.out.println( "Sum = " + sum);
    }
}
