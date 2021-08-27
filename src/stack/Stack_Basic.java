package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Basic {
    public static void main(String[] args) {
        /*Stack<Integer> s = new Stack<Integer>();
        s.push(7);
        s.push(5);
        s.push(4);
        while (!s.empty()) {

        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("How many N?");
        int n = sc.nextInt();

        Stack st = new Stack();

        for (int i = 0; i < n; i++) {
            System.out.println("Command?");
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                st.push(num);
            } else if (cmd.equals("top")) {
                if(st.empty()){
                    System.out.println("-1");
                } else{
                    System.out.println(st.peek());
                }

            } else if (cmd.equals("size")) {
                System.out.println(st.size());

            } else if (cmd.equals("empty")) {
                if (st.empty()) {
                    System.out.println("1");

                } else{
                    System.out.println("0");
                }

            } else if (cmd.equals("pop")) {
                if (st.empty()) {
                    System.out.println("-1");
                } else{
                    System.out.println(st.pop());
                }

            }
        }
        /*while (!st.empty()) {
            System.out.println(st.pop());
        }*/

        /*st.push(7);
        st.push(5);
        st.push(4);

        System.out.println("Stack");
        while (!st.empty()) {
            System.out.println(st.pop());
        }*/
    }
}
