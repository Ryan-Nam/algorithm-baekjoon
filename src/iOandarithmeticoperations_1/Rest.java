package iOandarithmeticoperations_1;

import java.io.*;
import java.util.StringTokenizer;

/*
Is (A+B)%C equal to ((A%C) + (B%C))%C?

Is (A×B)%C equal to ((A%C) × (B%C))%C?

Given three numbers A, B, and C, write a program that finds the above four values.

 */
public class Rest {
    public static void main(String[] args) throws IOException {

        //method 1
    /*
    Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		in.close();

		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
     */

        //method 2 BufferedReader + BufferedWriter


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write( ((A+B)%C) + "\n" );
        bw.write( ((A%C + B%C)%C) + "\n" );
        bw.write( ((A*B)%C) + "\n" );
        bw.write( ((A%C * B%C)%C) + "\n" );

        bw.flush();
        bw.close();
    }
}
