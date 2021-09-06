package stack;

import java.util.Scanner;
import java.util.Stack;

/*
* Problem
Parenthesis String (PS) consists of two parenthesis symbols ‘(’ and ‘)’ only. In parenthesis strings, some strings are called a valid PS (shortly, VPS). Let us give the formal definition of VPS. A single “( )” is a member of VPS, called the base VPS. Let x and y be a member of VPS. Then “(x)”, a VPS which encloses a VPS x with a single pair of parenthesis, is also a member of VPS. And xy, the concatenation of two VPS x and y, is a member of VPS. For example, “(())()” and ((()))” are all VPS, but “(()(”, “(())()))” and “(()” are not VPS. You are given a set of PS. You should decide if the input string is VPS or not.

Input
Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Then PS’s are given in the following T lines one by one. The length of each PS is between 2 and 50, inclusively.

Print
Your program is to write to standard output. Print the result in each line. If the input string is a VPS, then print “YES”. Otherwise print “NO”. */
public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Stack<String> stack = new Stack<String>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            Stack<Character> stack = new Stack<Character>();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else if (stack.empty()) {
                    System.out.println("NO");
                } else {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }


        }
    }
}
