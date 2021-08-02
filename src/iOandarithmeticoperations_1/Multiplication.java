package iOandarithmeticoperations_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
(three-digit number) × (three-digit number) is made through the following process.
Write a program to find the values positions (3), (4), (5), and (6) when given three-digit natural numbers to enter positions (1) and (2)

 */
public class Multiplication {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);

    }
}
