package stack;

import java.util.Scanner;

public class Answer_Parenthesis {
    public static String isValid(String s) {
        int n = s.length(); // size of Stack
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '(') {
                cnt += 1; // open braket = +1, close bracket = -1
            } else {
                cnt -= 1;
            }
            if (cnt < 0) { // This case is the when there is no more open braket,, means the number of close brakey is more than
                return "NO";
            }
        }
        if (cnt == 0) { // Stack is empty == right, correct
            return "YES";
        } else {
            return "NO"; // lack of ")"
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println(isValid(sc.next()));
        }
    }
}