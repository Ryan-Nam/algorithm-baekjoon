package basic_math_one_8;

import java.util.Scanner;

/*
problem
Joo-hee, who likes to attend neighborhood meetings, wants to take this opportunity to become the women's president, so she invites people from all floors to host the neighborhood.

In order to live in this apartment, there is a condition, "If you want to live in room b on the a floor, you must bring as many people as the sum of the number of people from rooms 1 to b on the lower (a-1) floor". must be kept and entered.

Assuming that there are no vacant houses in the apartment and all residents have been keeping the terms of this contract, print the number of people living in room n on floor k for the given positive integers k and n. However, apartments start from the 0th floor, and each floor has room 1 onwards, and i people live in room i on the 0th floor.

input
In the first line, the number of test cases T is given. And for each case, an integer k in the first line and an integer n in the second line are given as inputs.

Print
For each test case, print the number of residents in that house.
 */
public class Being_Women_President {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Build apt
        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;	// level i unit 1
            APT[0][i] = i;	// level 0 unit i
        }


        for(int i = 1; i < 15; i ++) {	// from level 1 to level 14

            for(int j = 2; j < 15; j++) {	// from unit 2 to unit 14
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        // Test part
        int T = in.nextInt();

        for(int i = 0; i < T; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(APT[k][n]);
        }
    }

}
