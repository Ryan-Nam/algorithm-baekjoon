/*
Problem:
 Write a program that takes two integers A and B as input and outputs A+B.

Input:
 The first line gives the number of test cases T.
Each test case consists of one line, with A and B on each line. (0 < A, B < 10)

Output:
 Output A+B for each test case.
*/
package for_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_Plus_B {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }*/

        // Method 2 - BufferedReader + StringToken
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // Important!, have to use str inside of for loop.
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }


        // Method 3 - BufferedReader + StringToken + StringBuilder
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);*/


    }
}
