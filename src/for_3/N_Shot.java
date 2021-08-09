/*
Problem:
Given a natural number N, write a program that prints the numbers 1 through N, one per line.

Input:
The first line is given a natural number N less than or equal to 100,000.

Output:
Prints from the first line to the Nth line sequentially.

user input 5 -> print 1,2,3,4,5

 */
package for_3;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class N_Shot {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }*/

        // Method 2 - BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
        }*/

        // Method 3 - BufferedReader + BufferedWriter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < n + 1; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
