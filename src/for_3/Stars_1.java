package for_3;
/*
problem
One star for the first row, two stars for the second row, and N stars for the Nth row.

input
The first line is given N(1 ≤ N ≤ 100).

Print
Stars are printed sequentially from the first line to the Nth line.

input = 3
*
**
***
*/

import java.io.*;
import java.util.Scanner;

public class Stars_1 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n + 1; i++) {
            for (int j =1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < n + 1; i++) {
            for (int j =1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
