package Others;

import java.util.Scanner;

/*
* Weekly pay
* working hours * based hourly rate
* if working hours over 40 in a week, over pay would be over working hours * based hourly rate * 1.5
* based hourly rate = 8dollars if it is samller than this, return error
* if working hours are over 60hrs, return error*/
public class Payment_Clerk {

    final static double basedHourlyRate = 8.00;
    final static double extraRate = 1.5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double workingHours = sc.nextDouble();
        calculatePayment(workingHours);
    }

    public static void calculatePayment(double hrs) {
        double result = 0.00;
        double extraHours = hrs-40;
        double normalPay = 0.00;
        normalPay = hrs * basedHourlyRate;

        if (hrs > 60) {
            System.out.println("Hrs is over 60, error");
        } else if (hrs > 40){
            result = normalPay * (extraHours * extraRate) ;
        } else {
            result = normalPay;
        }

        System.out.printf("Total Payment: $%.2f", result);

    }
}
