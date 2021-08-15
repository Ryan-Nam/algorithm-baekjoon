package string_7;

import java.util.Scanner;

/*
problem
N numbers are written without spaces. Write a program that sums up all these numbers and prints them.

input
The first line is given the number of numbers N (1 ≤ N ≤ 100). On the second line, N numbers are given without spaces.

Print
Outputs the sum of N numbers given as input.
 */
public class Sum_Of_Numbers {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum = sum + p;
        }
        System.out.println(sum);
    }
}
