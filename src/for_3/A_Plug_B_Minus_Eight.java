package for_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_Plug_B_Minus_Eight {

    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A+B));
        }


        // Method 2 - BufferedReader + StringToken
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // Important!, have to use str inside of for loop.
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A+B));
        }*/

    }

}
