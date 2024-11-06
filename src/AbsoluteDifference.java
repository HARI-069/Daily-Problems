/*
  Define a function int findCount(int arr[], int length, int num, int diff) that takes the following parameters:

        arr: an integer array.
        length: the length of the array.
        num: an integer to compare against.
        diff: an integer representing the maximum allowable absolute difference.

  The function should return the count of elements in arr that have an absolute difference with num less than or equal to diff.
  If no such elements exist, return -1.

  Example:
       Input:
        arr: [12, 3, 14, 56, 77, 13]
        num: 13
        diff: 2
        Output: 3

  Explanation:
      The elements in arr that have an absolute difference of 2 or less from 13 are 12, 13, and 14, resulting in a count of 3.
*/

public class AbsoluteDifference {
    public static void main(String... a) {
        int[] arr  = {12, 3, 14, 56, 77, 13};
        int num = 13;
        int diff = 2;

        System.out.println(findAbsDiff(arr, num, diff));
    }

    static int findAbsDiff(int[] arr, int num, int diff) {
        int count = 0;
        for (int i : arr) {
            if (abs(i - num) <= diff) count++;
        }
        return count;
    }

    static int abs(int num){
        return num < 0 ? -num : num;
    }
}
