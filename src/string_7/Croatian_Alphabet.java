package string_7;

import java.util.Scanner;

/*
Previously, it was not possible to input the Croatian alphabet in the operating system. Therefore, the Croatian alphabet was changed and entered as follows.

For example, ljes=njak consists of six Croatian alphabets (lj, e, š, nj, a, k). Given a word, print how many Croatian alphabets it consists of.

dž is unconditionally used as a single alphabet, and d and ž are not considered to be separate. The same goes for lj and nj. Alphabet not listed above is counted one letter at a time.

input
A maximum of 100 words is given on the first line. It consists only of lowercase letters and '-' and '='.

Words are made up of the Croatian alphabet. The alphabets in the table of the problem description are entered in a modified form.

Print
Prints the number of Croatian alphabets in the given word as input.
 */
public class Croatian_Alphabet {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String str = in.nextLine();

    int count = 0;

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if(ch == 'c') {			// 만약 ch 가 c 라면?
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == '=') {		//만약 ch 다음 문자가 '=' 이라면?
                    // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }
                else if(str.charAt(i + 1) == '-') {
                    i++;
                }
            }
        }

        else if(ch == 'd') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'z') {
                    if(i < str.length() - 2) {
                        if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                            i += 2;
                        }
                    }
                }

                else if(str.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'l') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'j') {	// lj 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'n') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'j') {	// nj 일 경우
                    i++;
                }
            }
        }

        else if(ch == 's') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == '=') {	// s= 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'z') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == '=') {	// z= 일 경우
                    i++;
                }
            }
        }

        count++;

    }

    System.out.println(count);
}
}