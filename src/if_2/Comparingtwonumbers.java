package if_2;

import java.util.Scanner;

public class Comparingtwonumbers {

    public static void main (String[] arg){


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(">");
        } else if ( a < b){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }


}
