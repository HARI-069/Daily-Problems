/*
Write a function `findDuplicates(int[] arr)` that takes an integer array arr as input and returns a list of duplicate
elements in the array.

The function should identify duplicate elements without using extra space for data structures (besides the output list)
and without modifying the elements’ values permanently. You can assume all elements in the array are positive integers,
with values ranging from 1 to n (where n is the length of the array).

Function Description:

    The function should iterate over the array arr and use element indices to mark visited numbers.
    If an element is found to be a duplicate, it should be added to the result list.
    The function should return a list of integers representing the duplicate elements in arr.

Example:

Input:
    arr = {2, 3, 1, 4, 5, 1, 4, 2}

Output:
    [1, 4, 2]

Explanation:

    The array contains duplicate values 1, 4, and 2. The function identifies and returns these duplicates.
 */


import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 1, 4, 2};

        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates (int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] < 0)
                result.add(Math.abs(arr[i]));
            else
                arr[index] = -arr[index];
        }

        return result;
    }
}
