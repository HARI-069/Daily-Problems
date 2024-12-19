/*
Problem Statement:

Write a Java program to check if a given array is monotonic. An array is said to be monotonic if it is either entirely
non-increasing or non-decreasing.

Input:
The program should accept an integer size, representing the number of elements in the array.
The program should accept size integers, representing the elements of the array.

Output:
Return true if the array is monotonic (either non-increasing or non-decreasing).
Return false if the array is not monotonic.

Example:
    Input:
    Enter the Size: 5
    Enter the values: 1 2 2 3 4
    Output: true
    Explanation: The array is non-decreasing as every element is greater than or equal to the previous element.

    Input:
    Enter the Size: 5
    Enter the values: 5 4 4 2 1
    Output: true
    Explanation: The array is non-increasing as every element is less than or equal to the previous element.

    Input:
    Enter the Size: 5
    Enter the values: 1 3 2 4 5
    Output: false
    Explanation: The array is neither non-decreasing nor non-increasing.
*/

import java.util.Scanner;
public class MonotonicArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the values: ");
        for(int i=0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(monotonicArr(arr));
    }

    static boolean monotonicArr(int[] arr) {
        boolean increasing = true, decreasing = true;

        for (int i=0 ; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                increasing = false;
            } else {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}
