package if_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* problem
Write a program that receives test scores and outputs A for 90 to 100, B for 80 to 89, C for 70 to 79, D for 60 to 69, and F for the rest of the scores.
* */
public class Test_Grade {
    public static void main(String[] args) throws IOException {
        // Method 1 - Scanner
        //Input
        /*Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();

        //logic
        System.out.println((grade>=90)?"A": (grade>=80)?"B": (grade>=70)?"C": (grade>=60)?"D": "F");*/
        /*
        if(grade >= 90){
            System.out.println("A");
        } else if (grade >= 80 ){
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        */

        // Method 2 - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());
        System.out.println((score>=90)?"A": (score>=80)?"B": (score>=70)?"C": (score>=60)?"D": "F");

    }
}
