package Others;


import java.util.Arrays;

/*Bateria is increasing, 1,2,4,8,16,31,64,128,256,512
* N * 2 still O of N
* */
public class Bacteria_arrayAndLoop {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(2, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
