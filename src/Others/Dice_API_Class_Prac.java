package Others;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* return 1 - N, random int,
*
* return the average of dice that rolled 100 times*/
public class Dice_API_Class_Prac {
    // Let's write the one time dice.
    // use Java API random class
    public static void main(String[] args) {
        // 1. get enter
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 2. create n dice
        Die d = new Die(N);

        // 3. 1000 result save
        // Primitive Type cannot be stored
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            int randNum = d.roll();
            numbers.add(randNum);
        }
        // 4. average
        double avg = average(numbers);
        // 5. print
        System.out.println("avg " + avg);
    }


    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer n : list) {
            sum += n;
        }
        return sum / list.size();
    }
}

class Die {
    private int maxNumber; // maximun dice number

    //constructor
    public Die(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int roll() {
        // method 1 ~ N return
        Random rand = new Random();
        return 1 + rand.nextInt(maxNumber); //[0 ~ 5] 1,2,3,4,5 , +1
    }
}
