package Others;

import java.util.Scanner;

public class Rare_Item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int hp = sc.nextInt();
        int mp = sc.nextInt();
        System.out.println(wearItem(hp,mp));*/

        int age = sc.nextInt();
        System.out.println(getRole(age));
    }

    public static String getRole(int a) {
        String role ="";
        if (a >= 18) {
            role = "Adult";
        } else if (a >= 13) {
            role = "ten";
        } else if (a >= 6) {
            role = "child";
        } else if (a <= 5) {
            role = "Kid";
        }
        return role;
    }

    /*public static String wearItem(int h, int m) {
        String result = "You are not able to use this item";
        if (h > 2000 && m > 2000) {
            result = "You are used this item";
        }
        return result;
    }*/

}
