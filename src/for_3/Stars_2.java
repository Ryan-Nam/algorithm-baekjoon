package for_3;
/*
problem
One star for the first row, two stars for the second row, and N stars for the Nth row.

However, print the stars (see example) sorted by right.

input
The first line is given N(1 ≤ N ≤ 100).

Print
Stars are printed sequentially from the first line to the Nth line.

* */

import java.io.IOException;
import java.util.Scanner;

public class Stars_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n ; i++) {
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
