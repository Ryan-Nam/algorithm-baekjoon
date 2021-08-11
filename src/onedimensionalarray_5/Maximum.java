package onedimensionalarray_5;
/*
problem
Given 9 different natural numbers, write a program to find the maximum among them and find the number that is the maximum.

For example, 9 different natural numbers

3, 29, 38, 12, 57, 74, 40, 85, 61

Given this, the maximum of these is 85, which is the eighth number.

input
From the first line to the ninth line, one natural number is given per line. The given natural number is less than 100.

Print
Prints the maximum value on the first line, and prints the number of the maximum value on the second line.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        // Method 1 - Scanner
        Scanner sc = new Scanner(System.in);

        int n = 9;
        int [] array = new int [9];

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();
        //Arrays.sort() method to filter,
        Arrays.sort(array);
        System.out.println(array[n-1]);
        System.out.println(array[n-1]);

    }
}
