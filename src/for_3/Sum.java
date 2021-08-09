/*
Problem:
John got a bad mark in math. The teacher gave him another task. John is to write a program which computes the sum of integers from 1 to n. If he manages to present a correct program, the bad mark will be cancelled.

Write a program which:

reads the number n from the standard input,
computes the sum of integers from 1 to n,
writes the answer to the standard output.

Input:
The first and only line of the standard input contains one integer n (1 ≤ n ≤ 10 000).

Output:
One integer is to be written to the standard output. This integer should be the sum of integers from 1 to n.
*/
package for_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum = sum + i; // sum += 1;
        }
        System.out.println(sum);*/

        // Method 2 - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        br.close();
        int sum = 0;

        for( int i = 1 ; i < n + 1 ; i++ ) sum+=i;

        System.out.println(sum);

    }
}
