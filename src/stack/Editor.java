package stack;

import java.util.Scanner;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // two stack between the cursor (line), left and right
        Stack<Character> left = new Stack<Character>();
        Stack<Character> right = new Stack<Character>();

        //String ex)abcdefg
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            //char c = str.charAt(i);
            //left.push(c);
            left.push(str.charAt(i));
        }




        // how many time run
        int n = sc.nextInt();
        sc.nextLine(); // remove all the buffer

        while (n-- > 0) {
            String[] line = sc.nextLine().split(" ");
            char what = line[0].charAt(0);

            // L
            if (what == 'L') {
                if (!left.empty()) {
                    /*left.pop();
                    right.push();*/
                    right.push(left.pop());
                }
            }

            // D
            else if (what == 'D') {
                if (!right.empty()) {
/*                    right.pop();
                    left.push();*/
                    left.push(right.pop());
                }
            }


            // P $
            else if ( what == 'P'){
                char c = line[1].charAt(0);
                left.push(c);
            }

            //B
            else if (what == 'B'){
                if (!left.empty()) {
                    left.pop();
                }
            }
        }

        // After done all the process
        // move everything to right side and then pop everything
        while(!left.empty()){
            /*left.pop();
            right.push();*/
            right.push(left.pop());
        }

        /*while (!right.empty()) {
            System.out.println(right.pop());
        }*/
        StringBuilder sb = new StringBuilder();
        while (!right.empty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
