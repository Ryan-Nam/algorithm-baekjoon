package onedimensionalarray_5;

import java.util.Arrays;
import java.util.Scanner;

/*
problem
N integers are given. In this case, write a program to find the minimum and maximum values.

input
The first line is given the number of integers N (1 ≤ N ≤ 1,000,000). In the second line, N integers are given, separated by spaces. All integers are integers greater than or equal to -1,000,000 and less than or equal to 1,000,000.

Print
Prints the minimum and maximum values ​​of N integers given in the first line, separated by spaces.

5
20 10 32 50 2

and then find the maximum which is 50
find the minimu
 */
public class Minimum_maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] array = new int [n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();
        //Arrays.sort() method to filter,
        Arrays.sort(array);
        System.out.print(array[0] + " " + array[n-1]);
    }
}
