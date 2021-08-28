package Others;

import java.util.Scanner;

public class Audult_Auth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int n = sc.nextInt();

        order(n);
    }

    public static void order(int a) {
        if (a > 18) {
            System.out.println("Yes, Over 18, can buy a beer");
        } else{
            System.out.println("Minor, go home");
        }
    }
}
