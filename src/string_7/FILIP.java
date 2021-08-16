package string_7;
/*
Problem
Mirko has a younger brother, Filip, who just started going to school and is having trouble with numbers. To help him get the hang for number scale, his teacher writes two three digit numbers. She asks Filip to compare those numbers, but instead of interpreting them with the leftmost most significant digit, he needs to interpret them the other way around, with the most significant digit being the rightmost one. He than has to tell the teacher the larger of the two numbers.

Write a program that will check Filips answers.

Input
The first and only line of input contains two three digit numbers, A and B. A and B will not be equal and will not contain any zeroes.

Output
First and only line of output should contain the larger of the numbers in the input, compared as described in the task. The number should be written reversed, to display to Filip how he should read it.
 */

import java.util.Scanner;

// Main purpose: if you can flip the number (type= String) that you are entered.
public class FILIP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);
    }
}
