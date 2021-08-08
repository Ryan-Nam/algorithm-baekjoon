package if_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Problem:
 Given a year, write a program that prints 1 if it is a leap year, or 0 otherwise.
A leap year is when the year is a multiple of 4 but not a multiple of 100 or a multiple of 400.
For example, 2012 is a leap year because it is a multiple of 4 and not a multiple of 100. The year 1900 is not a leap year because it is a multiple of 100 and not a multiple of 400. However, the year 2000 is a leap year because it is a multiple of 400.

Input:
 The year is given in the first line. year is a natural number greater than or equal to 1 and less than or equal to 4000.

Print:
 The first line prints 1 if it is a leap year, and 0 otherwise.

Me:
*/
public class Leap_Year {
    public static void main(String[] args) throws IOException {

        /*// Method 1 - Scanner
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(1); // This is leap year
            } else if (year % 100 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        if (y % 4 == 0) {
            if (y % 400 == 0) {
                System.out.println(1); // This is leap year
            } else if (y % 100 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }


    }

}
