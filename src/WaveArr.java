import java.util.*;
public class WaveArr {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Wave Array: " + Arrays.toString(makeItWave(arr)));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] makeItWave(int[] arr) {
//        int i=0, j=1;
//        while (i < arr.length && j < arr.length) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i += 2;
//            j += 2;
//        }
        for (int i = 0; i < arr.length; i+=2) {
            if(i+1 < arr.length) {
                swap(arr,i,i+1);
            }
        }

        return arr;
    }
}
