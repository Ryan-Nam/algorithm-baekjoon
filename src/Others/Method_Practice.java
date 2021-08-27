package Others;

public class Method_Practice {

    public static void main(String[] args) {

        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("Amount: $%.2f(%.0fwon)", dollar, won);

    }

    //return 1~6
    public static int dice (){
        // Math.random(); return Double -> 0.00 ~ 0.99..
        // Math.random() *  6 -> 0.00 ~ 5.99
        //double -> int : (int) (Math.random()*6) -> 0~5

        // start from start among n, random int
        //int num = (int)(Math.random() * n ) + start
        return (int)(Math.random()*6) +1;
    }

    public static double exchange(double dollar){
        return dollar * 1082.25108;
    }
}

