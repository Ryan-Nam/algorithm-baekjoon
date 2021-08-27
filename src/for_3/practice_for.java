package for_3;

import java.util.Scanner;

public class practice_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();*/
        sc.close();

        /*for (int i =0; i<n; i++){
            System.out.println(i+1);
        }*/

       /*for (int i = n; i > 0; i--) {
            System.out.println(i);
        }*/

        /*for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        /*for (int i = 0; i < n; i++) {
            String binaryStre = Integer.toString(i, 2);
            System.out.println(binaryStre);
        }*/

        // 0.00 - 0.99 * 6 => 0 ~ 5.95... so + 1
        int randomValue = (int) (Math.random() * 6) + 1;
        System.out.println(randomValue);

        if (randomValue == 1) {
            System.out.println("Result is " + randomValue);
        } else if (randomValue == 2) {
            System.out.println("Result is " + randomValue);
        } else if (randomValue == 3) {
            System.out.println("Result is " + randomValue);
        } else if (randomValue == 4) {
            System.out.println("Result is " + randomValue);
        } else if (randomValue == 5) {
            System.out.println("Result is " + randomValue);
        } else {
            System.out.println("Result is " + randomValue);
        }
    }
}
