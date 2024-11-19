import java.util.Arrays;

public class RotateArray {
    public static void main(String... a) {
        int[] inputArray = {3,2,1,6,4,5};
        int timesRotate  = 1;
        System.out.println(Arrays.toString(rightRotate(inputArray, timesRotate)));
    }

    static int[] rightRotate(int[] arr, int position) {
        for (int j = 0; j < position; j++){
            int lastEl = arr[arr.length-1];
            for (int i = arr.length-1; i > 0 ; arr[i] = arr[i-1], i--);
            arr[0] = lastEl;
        }
        return arr;
    }
}
