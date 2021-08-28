package Others;

public class Who_Is_First_One_ArrayAndLoop {
    public static void main(String[] args) {
        // Name Array
        String[] name = {"Elena", "Suzle", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
        // Score Array
        int[] score = {65, 74, 23, 75, 68, 96, 88, 98, 54};

        // Find first one's score
        int n = topIndex(score);
        System.out.printf("First One: %s(%d)\n", name[n], score[n]);
    }

    public static int topIndex(int[] arr) {
        int topIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[topIndex] < arr[i]){
                topIndex = i;
                /*arr[topIndex] = arr[i];*/
            }
        }
        return topIndex;
    }
}
