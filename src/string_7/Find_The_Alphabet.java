package string_7;
/*
problem
A word S consisting of only lowercase letters of the alphabet is given. For each alphabet, write a program that prints the position of the first occurrence if it is included in a word, and -1 if it is not included in the word.

input
The first line is given the word S. Words must not exceed 100 in length and consist only of lowercase letters of the alphabet.

Print
For each alphabet, the position of the first occurrence of a, the position of the first occurrence of b, and the position of the first occurrence of ... z are separated by spaces.

If a certain alphabet is not included in the word, -1 is output. The first letter of the word is at position 0, and the second letter is at position 1.
 */

import java.util.Scanner;

public class Find_The_Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = in.nextLine();

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {	// 배열 출력
            System.out.print(val + " ");
        }
    }
}
