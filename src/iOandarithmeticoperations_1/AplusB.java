package iOandarithmeticoperations_1;
import java.io.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Write a program that takes two integers A and B as input and outputs A+B.

public class AplusB {
    public static void main (String[] args) throws IOException {

        // method 1
        /*
        Scanner in = new Scanner(System.in); // create object, System.in means reading this with Byte
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A+B);

        in.close();
         */

        // method 2
        // Read() = only read one character
        // readLine() = read one line, so using Readline()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken()); //st.nextToken return only String, so change Datatype(to int)
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        /*

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(a+b);

        */


        // method 3 = receive things, and split with " ", store in the Array String
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println(a*b);
         */

    }
}
