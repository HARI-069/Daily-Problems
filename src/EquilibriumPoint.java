/*
Write a Java program to find the Equilibrium Point in an array of integers. The equilibrium point is an index where the
sum of elements on the left is equal to the sum of elements on the right.

Input Format:
    The program should prompt the user to enter the size of the array.
    The program should then accept n integers as elements of the array.

Output:
    If an equilibrium point exists, print the value at the equilibrium point.
    If no equilibrium point exists, print "No Equilibrium Point".

Function Description:
    Implement the function `int equilibriumPt(int[] arr)` which:
        Takes an integer array arr as input.
        Returns the element at the equilibrium point if it exists; otherwise, returns -1.

    The function should:
        Calculate the total sum of the array.
        Use the concept of left and right sums to find the equilibrium point in a single pass after computing
        the total sum.
Example:
Input:
    Enter the size: 5
    Enter the Elements: 3 1 5 2 2

Output:
    Equilibrium Point: 5

Explanation:
    In the array [3, 1, 5, 2, 2], the element 5 is the equilibrium point because the sum of elements
    to the left (3 + 1 = 4) is equal to the sum of elements to the right (2 + 2 = 4).
*/



public class EquilibriumPoint {
    public static void main(String... a) {
        int[] inputArr = {3, 1, 5, 2, 2};

        System.out.println(equilibriumPt(inputArr));
    }

    static int equilibriumPt(int[] arr) {
        int rightSide = 0, leftSide = 0;

        for (int num : arr) {
            rightSide += num;
        }

        for (int num : arr) {
            rightSide -= num;

            if (rightSide == leftSide) {
                return num;
            }

            leftSide += num;
        }

        return -1;
    }
}
