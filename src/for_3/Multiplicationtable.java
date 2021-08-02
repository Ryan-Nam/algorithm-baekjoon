package for_3;

import java.io.*;
import java.util.Scanner;

/*
Problem:
Write a program that takes N as input and outputs the N multiplication tables.
You have to print it according to the output format.

Input:
N is given in the first line. N is greater than or equal to 1 and less than or equal to 9.

Print:
Outputs from N*1 to N*9 as in the output format.
 */
public class Multiplicationtable {
    public static void main (String[] args) throws IOException {


        // Method 1 - Scanner
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        for(int i=1; i<10; i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }
         */

        // Method 2 - BufferedReader + sout
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        for(int i=1; i<10; i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }

         */

        // Method 3 - BufferedReader + String Builder
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.append(n).append(' ').append('*').append(' ').append(i);
            sb.append(' ').append('=').append(' ').append(n*i).append('\n');
        }
        System.out.println(sb);

         */

        // Method 4 - BufferedReader - Buffered Writer (My style)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=1; i<10; i++){
            bw.write(a+" * "+i+" = "+a*i+"\n");
        }
        bw.flush();
        bw.close();

    }
}
