package for_3;

import java.io.*;
import java.util.StringTokenizer;
/*
Before solving the for loop problem in earnest, there are a few things to be aware of. If the input/output method is slow, a timeout may occur when inputting or outputting multiple lines.

Using C ++, and cin/ coutif you want to use, cin.tie(NULL)and sync_with_stdio(false)give it applies to both, endlinstead of a newline character ( \nRefurbished). However, if you do this, you can no longer  use C input / output methods such as scanf/ printf/ puts/ getchar/ putchar.

If you are using Java, you can use Scannerand System.out.printlninstead of BufferedReaderand BufferedWriter. BufferedWriter.flushis only done once at the very end.

If you're using Python, input instead sys.stdin.readlineyou can use. However, in this case .rstrip(), it is better to add , if you want to save the character string because it receives input up to the newline at the end .

Also, since the input and output streams are separate, it is not necessary to output all of the test cases after receiving and saving them. After receiving one test case, you can print one out.

Detailed explanations and other languages are described in this article .

Many other tips from BOJ can be found in this blog post .

Have to be done within 1500ms, 1.5 second => No Scanner, No Sout
* */

public class Fast_A_Plus_B {
    public static void main(String[] args) throws IOException {


        /*// Method 2 - BufferedReader + StringToken
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // Important!, have to use str inside of for loop.
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A + B+ "\n");
            //bw.flush();
        }
        br.close();

        // 
        bw.flush();
        bw.close();




    }
}
