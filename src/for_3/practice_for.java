package for_3;

import java.util.Scanner;

public class practice_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*for (int i =0; i<n; i++){
            System.out.println(i+1);
        }*/

       /*for (int i = n; i > 0; i--) {
            System.out.println(i);
        }*/

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
