package if_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Problem:
 A common problem in mathematics is to determine which quadrant a given point lies in. There are four quadrants, numbered from 1 to 4, as shown in the diagram below:
For example, the point A, which is at coordinates (12, 5) lies in quadrant 1 since both its x and y values are positive, and point B lies in quadrant 2 since its x value is negative and its y value is positive.
Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be 0.

Input:
 The first line of input contains the integer x (−1000 ≤ x ≤ 1000; x ≠ 0). The second line of input contains the integer y (−1000 ≤ y ≤ 1000; y ≠ 0).

Output:
 Output the quadrant number (1, 2, 3 or 4) for the point (x, y).


*/
public class Quadrant_Selection {
    public static void main(String[] args) throws IOException {
        /*// Method 1 - Scnnaer
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        if(X > 0) {
            if(Y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }

        else {
            if(Y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }*/


        // Method 2 - BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        if(X > 0) {
            if(Y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }

        else {
            if(Y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }

    }
}
