package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 15, 25, 195, 21533};
        int maxValue = 0;

        maxValue = getMaxPosition(arr);
        System.out.println("The max value is: " + maxValue );

    }

    public static int getMaxPosition(int[] arr) {
        int maxValue = 0;

        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
