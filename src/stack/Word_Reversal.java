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
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            //Stack<Character> stack = new Stack<Character>();
            String str = sc.nextLine();
            System.out.println(str);
        }

    }
}
