package iOandarithmeticoperations_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Cats {
    public static void main(String[] args) throws IOException {
        /*
        * Escape Sequance
        * \ (Back Slash) + characters, " also used with escape sequence
        *
        * ex) \ -> \\, \\ -> \\\\
        * ex) \', \"
        * ex) \t, \b, \n, \r, \f
        * */


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();

        bw.write(" )  ( ')");
        bw.newLine();

        bw.write("(  /  )");
        bw.newLine();

        bw.write(" \\(__)|");


        bw.newLine();
        bw.write("|\\_/|");
        bw.newLine();

        bw.write("|q p|   /}");
        bw.newLine();

        bw.write("( 0 )\"\"\"\\");
        bw.newLine();

        bw.write("|\"^\"`    |");
        bw.newLine();

        bw.write("||_/=\\\\__|");

        bw.flush();
        bw.close();
    }
}
