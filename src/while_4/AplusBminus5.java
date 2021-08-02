package while_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
problem:
Write a program that takes two integers A and B as input and outputs A+B.

input:
The input consists of several test cases.
Each test case consists of one line, with A and B on each line. (0 < A, B < 10)
Two zeros are entered at the end of the input.

Print:
Output A+B for each test case.
 */
public class AplusBminus5 {
    public static void main (String[] arg) throws IOException{

        // Method 1 - Scanner
        /*
        Scanner in=new Scanner(System.in);

        while(true){

            int A=in.nextInt();
            int B=in.nextInt();

            if(A==0 && B==0){
                in.close();
                break;
            }
            System.out.println(A+B);
        }

         */

        // Method 2 - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            if (a == 0 && b == 0) {
                break;
            }
            sb.append((a+b)).append('\n');
        }
        System.out.println(sb);


        // Method 3 
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while(true) {

			String str = br.readLine();

			int A = str.charAt(0) - 48;  //or - '0'
			int B = str.charAt(2) - 48;

			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
         */



    }
}
