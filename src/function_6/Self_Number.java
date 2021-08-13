package function_6;
/*
In 1949 the Indian mathematician D.R. Kaprekar discovered a class of numbers called self-numbers. For any positive integer n, define d(n) to be n plus the sum of the digits of n. (The d stands for digitadition, a term coined by Kaprekar.) For example, d(75) = 75 + 7 + 5 = 87. Given any positive integer n as a starting point, you can construct the infinite increasing sequence of integers n, d(n), d(d(n)), d(d(d(n))), .... For example, if you start with 33, the next number is 33 + 3 + 3 = 39, the next is 39 + 3 + 9 = 51, the next is 51 + 5 + 1 = 57, and so you generate the sequence

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

The number n is called a generator of d(n). In the sequence above, 33 is a generator of 39, 39 is a generator of 51, 51 is a generator of 57, and so on. Some numbers have more than one generator: for example, 101 has two generators, 91 and 100. A number with no generators is a self-number. There are thirteen self-numbers less than 100: 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, and 97.

Write a program to output all positive self-numbers less than 10000 in increasing order, one per line.
 */
public class Self_Number {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];	// 1부터 10000이므로

        for (int i = 1; i < 100001; i++){
            int n = d(i);

            if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }
    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number % 10); // 첫 째 자리수
            number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;

    }
}
