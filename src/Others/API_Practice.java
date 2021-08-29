package Others;

import java.util.Random;

public class API_Practice {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = rand.nextInt(); // -123123213123 ~ 123123123123
        int b = rand.nextInt(30); // 0 ~ 30;
        double c = rand.nextDouble(); // 0.0000 ~ 0.99999
        boolean d = rand.nextBoolean(); // ture or false

        System.out.printf("nextInt(): %d\n", a);
        System.out.printf("nextInt(): %d\n", b);
        System.out.printf("nextDouble(): %f\n", c);
        System.out.printf("nextBoolean(): %s\n", d);
    }
}
