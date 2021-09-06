package stack;

import java.util.Scanner;
import java.util.Stack;

/*
* problem
Nacoder Captain Jaemin is managing the book to prepare for a club dinner.

Jaehyun is helping Jaemin in managing money, but unfortunately, Jaehyun, who is always crazy, often has an accident by calling money by mistake.

Jaehyun shouts 0 whenever he calls the wrong number, so that the most recently written number by Jaemin is erased.

After taking all the numbers like this, Jaemin wants to know the sum of the numbers. Let's help Jaemin!

input
An integer K is given in the first line. (1 ≤ K ≤ 100,000)

After that, one integer is given to each of the K lines. An integer has a value between 0 and 1,000,000. If the integer is "0", the most recently written number is deleted, otherwise, the number is written.

If the integer is "0", we can guarantee that there is an erasable number.

Print
Prints out the sum of the numbers that Jaemin finally wrote down. The final sum of the numbers is an integer less than or equal to 2 31 -1.*/
public class Zero {
    public static void main(String[] args) {
        // number of input k
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // Stack
        Stack<Integer> st = new Stack<Integer>();

        // Loop for number of k
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();

            // condition logic: when a user entered 0, remove previous input
            if (n == 0) {
                st.pop();
                // otherwise, store,
            } else {
                st.push(n); // instead of push, add() also possible
            }
        }


        int sums = 0;
/*        for (int kj = 0; kj < st.size(); kj++) {
            sums += st.pop();
        }*/
        while (!st.empty()) {
            sums = sums + st.pop();
        }
        System.out.println(sums);

    }
}
