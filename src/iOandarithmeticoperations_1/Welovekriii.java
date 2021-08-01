package iOandarithmeticoperations_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Welovekriii {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //OutputSteamWriter help to encoding to UTF-8

        bw.write("ROKMC");
        bw.newLine();	// Line separater, similar with \n
        bw.write("ROKMC");

        bw.flush(); //Steam clear
        bw.close(); //strea close
    }
}
