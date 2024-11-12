/*
    Problem Statement:

Write a Java program to check if there exists a pair of elements in an integer array that adds up to a given key value.

Input Format:
The program should prompt the user to enter the size of the array.
The program should then accept n integers as the elements of the array.
Finally, the program should prompt for a key value to check if any two elements in the array sum up to this value.
Output:
If a pair of numbers exists that adds up to the key value, the program should return true.
If no such pair exists, it should return false.
Function Description:
Implement the function boolean keyPair(int[] arr, int keyVal) which:

Takes an integer array arr and an integer keyVal as inputs.
Returns true if there exists a pair in the array that sums to keyVal, and false otherwise.
The function should:

Use a HashSet to store the required values (the difference between keyVal and each array element) as it iterates through the array.
For each element, check if it is present in the HashSet, which would mean a matching pair has been found.
Example:
Input:


Enter the Size: 5
Enter the Elements: 10 15 3 7 8
Enter Key Value: 17
Output:


true
Explanation: In the array [10, 15, 3, 7, 8], the pair 10 and 7 adds up to 17, so the program returns true.
*/

import java.util.HashSet;
import java.util.Set;

public class KeyPairs {
    public static void main(String[] args) {
        int[] inputArr = {10, 15, 3, 7, 8};
        int keyValue = 17;

        System.out.println(keyPair(inputArr, keyValue));
    }

    static boolean keyPair(int[] arr, int key) {
        Set<Integer> numSet = new HashSet<>();

        for(int num: arr){
            if(numSet.contains(num)) return true;
            else {
                int newVal = key -num;
                numSet.add(newVal);
            }
        }
        return false;
    }
}
