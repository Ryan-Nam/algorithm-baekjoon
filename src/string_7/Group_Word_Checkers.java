package string_7;
/*
problem
A group word refers to all the letters in a word, only when each letter appears consecutively. For example, ccazzzzbb is a group word because c, a, z, and b all appear consecutively, and kin is also a group word because k, i, n appear consecutively, but aabbbccb is not a group word because b appears apart.

Write a program that takes N words as input and outputs the number of group words.

input
The first line contains the number of words N. N is a natural number less than or equal to 100. Words are entered in N lines starting from the second line. Words consist only of lowercase letters, do not overlap, and have a maximum length of 100.

Print
Prints the number of group words in the first line.
 */

import java.util.Scanner;

/*
* My plan
* 1. get entered n how many word will be entered
* 2 business logic to find group word*/
/* TIP!!!! use boolean*/
public class Group_Word_Checkers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0; // variable initialization
        for (int i = 0; i < n; i++) {
            //Business Logic to find group words
            // if(true) return sum +=   : sum = sum + 1
            sum = sum + i;
        }

        System.out.println(sum);

    }

}
