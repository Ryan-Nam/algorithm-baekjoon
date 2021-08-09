package for_3;

import java.io.*;
import java.util.Scanner;

public class UpsideDown_N_Shot {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = n; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
