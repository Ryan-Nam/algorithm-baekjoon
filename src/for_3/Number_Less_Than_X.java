package for_3;
/*
problem
We are given a sequence A of N integers and an integer X. In this case, write a program that prints all the numbers in A that are less than X.

input
The first line gives N and X. (1 ≤ N, X ≤ 10,000)

In the second line, N integers forming the sequence A are given. The given integers are all integers greater than or equal to 1 and less than or equal to 10,000.

Print
Outputs the numbers less than X, separated by spaces, in the order in which they were input. There is at least one number less than X.
 */

import java.util.Scanner;

public class Number_Less_Than_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int n = sc.nextInt();
            if(n<X){
                sb.append(n+" ");
            }
        }
        System.out.println(sb);
    }
}
