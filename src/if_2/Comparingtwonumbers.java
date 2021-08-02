package if_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Comparingtwonumbers {

    public static void main (String[] arg) throws IOException {

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        in.close();

        // method 1 - 1
        if (a > b){
            System.out.println(">");
        } else if ( a < b){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        // method 1 - 2
        String str = (A>B) ? ">" : ((A<B) ? "<" : "==" );
		System.out.println(str);

        // method 1 - 3 = Increased Readability
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
        */

        // Method 2 Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println((a>b) ? ">" : ((a<b) ? "<" : "==" ));

        /*
        // Method 3 - array, split
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println((a>b) ? ">" : ((a<b) ? "<" : "==" ));


         */

    }


}
