package iOandarithmeticoperations_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Helloworld {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        System.out.print("Hello World!");


        // Method 2 - IO class in Buffer
        // Faster than Scanner
        // unlike the scanner reading data one by one, store data at the temporary storage, then send or print them all in once
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();

        // Method 3 - String Builder
        // Similar with Beffer, store data at the temporary storage, and then send them all in once.
        // Very efficient when control STRING
        // Remarkable feature = "append"
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");

        System.out.println(sb);

        // Method 4 - String Buffer
        // In the case of "Multi-thread", have to be used.
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello World!");

        System.out.println(sb2);
    }
}
