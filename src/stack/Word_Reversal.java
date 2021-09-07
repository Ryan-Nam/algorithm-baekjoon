package stack;

import java.util.Scanner;
import java.util.Stack;

/*
* Problem
For each list of words, print a line with each word reversed without changing the order of the words. Each word consists of English letters only.

* Input
The input consists of T test cases. The number of test cases (T) is given in the first line of the input file. Each test case consists of a single line: each line contains a list of words separated by one space.

Print
For each test case, print the output on one line.*/
public class Word_Reversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Number of N (Loop)
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<Character>();
            String s = sc.nextLine();

            // Number of s... hello ryan => 10 times..
            for (int j = 0; j < s.length(); j++) {
                // if there is a space
                if(s.charAt(j) == ' '){
                    // put everything out
                    while (!stack.empty()) {
                        System.out.print(stack.pop());
                    }
                    // Insert space
                    System.out.print(" ");
                } else {
                    stack.push(s.charAt(j));
                }
            }

            // this is for last word..because last word does not end before space.
            while(!stack.empty()){
                System.out.print(stack.pop());
            }
            // after loop, enter
            System.out.println();
        }
    }
}

