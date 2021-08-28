package Others;

import java.util.Scanner;

public class Rare_Item {

    public static double calculateBMI(double w, double h) {
        return w / (h*h);
    }

    public static void printBMICalssification(double bmi) {
        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi > 30) {
            System.out.println("Overweighy");
        } else if (bmi >= 25) {
            System.out.println("Just over weight");
        } else if (bmi >= 18.5) {
            System.out.println("Average");
        } else {
            System.out.println("Eet more");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int hp = sc.nextInt();
        int mp = sc.nextInt();
        System.out.println(wearItem(hp,mp));*/

       /* int age = sc.nextInt();
        System.out.println(getRole(age));*/

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        calculateBMI(weight, height);

    }

    /*public static String getRole(int a) {
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
    }*/

    /*public static String wearItem(int h, int m) {
        String result = "You are not able to use this item";
        if (h > 2000 && m > 2000) {
            result = "You are used this item";
        }
        return result;
    }*/

}
