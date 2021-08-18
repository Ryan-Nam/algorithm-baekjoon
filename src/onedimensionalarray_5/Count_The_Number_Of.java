package onedimensionalarray_5;
/*
problem
Write a program to find the number of times each number from 0 to 9 is used in the result of calculating A × B × C given three natural numbers A, B, and C.

For example, if A = 150, B = 266, C = 427, then A × B × C = 150 × 266 × 427 = 17037300. As a result of the calculation, 0 is 3 times, 1 is 1, 3 is 2 times. , 7 is used twice.

input
The first row is given A, the second row is B, and the third row is C. A, B, and C are all natural numbers greater than or equal to 100 and less than 1,000.

Print
The first line prints the number of times 0 is used in the result of A × B × C. Similarly, from the second line to the tenth line, the number of times 1 through 9 is used in the result of A × B × C, one per line in turn.
 */

import java.util.Scanner;

public class Count_The_Number_Of {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        in.close();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}