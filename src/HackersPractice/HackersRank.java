package HackersPractice;

import java.util.Scanner;

public class HackersRank {
    public static void main (String[] arg){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //how to be odd number ,1,3,5,6
        // 4/2 != 0   0 also even number
//        N = N%2;
//        if((n == 0 && n>=2 && n<=5) || (n == 0 && n >= 20) ){
//            System.out.println("Not Weird");
//        } else if (n==0 && n>=6 && n<=20){
//            System.out.println("Weird");
//        }
//        else{
//            System.out.println("Weird");
//        }

        if ((N % 2 == 0 && N >= 2 && N <= 5) || (N % 2 == 0 && N > 20)) {
            System.out.println("Not Weird");

        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
