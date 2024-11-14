
/*
    Write a Java program to determine if a given year is a leap year. A leap year in the Gregorian calendar occurs under the following conditions:

    A year is a leap year if it is divisible by 400.
    If a year is not divisible by 400, it is a leap year if it is divisible by 4 but not divisible by 100.
    Input:
    The program should prompt the user to enter a year as an integer.
    Output:
    Print "Leap Year" if the year is a leap year.
    Print "Not a Leap Year" if the year is not a leap year.
*/


import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();

        if(year%4==0 && year%100==0){
            System.out.println("Leap Year");
        } else if (year%400==0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("not Leap Year");
        }
    }
}
