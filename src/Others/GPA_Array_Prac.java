package Others;

import java.util.Arrays;
import java.util.Scanner;

public class GPA_Array_Prac {
    public static void main(String[] args) {

/* Q1- method 1
        double[] gpa = {3.45, 2.82, 4.85, 3.64};
        System.out.println("Year 1: " + gpa[0]);
        System.out.println("Year 2: " + gpa[1]);
        System.out.println("Year 3: " + gpa[2]);
        System.out.println("Year 4: " + gpa[3]);*/
/* Q1- method 2
        double[] gpa = {3.45, 2.82, 4.85, 3.64};
        for (int i = 0; i < gpa.length; i++) {
            System.out.println("Year " + (i+1) +": " + gpa[i]);
            // Error: i+1  => 11 21 31 41 so, () is necessary
        }*/
/* Q2

        int[] arr = {52, 50, 55, 42, 38};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Total: " + result + " cups");
*/
        /*// Q3 + method included below
        // Total Sum of Array elements
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum(arr));*/
    }

    /*// Q3's method
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }*/
}
