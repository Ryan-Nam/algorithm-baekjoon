package basic_math_one_8;

import java.util.Scanner;

/*
problem
In an infinitely large array, the fractions are written as follows:


The fractions listed in this way are 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 1, 2, 3, 4, 5, ... Let's call it a fountain.

Write a program to find the Xth fraction, given X.

input
The first line gives X(1 ≤ X ≤ 10,000,000).

Print
Print the fraction on the first line.


 */
public class Find_a_fountain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int cross_count = 1, prev_count_sum = 0;

        while (true) {

            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }

}
