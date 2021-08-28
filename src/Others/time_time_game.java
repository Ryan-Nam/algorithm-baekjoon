package Others;

public class time_time_game {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("\t %d X %d = %d\n", i,j, i*j); // tap effect = indent
            }
        }
    }
}
