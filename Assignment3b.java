//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//Interest rate in a 6 month period
import java.util.Scanner;
public class Assignment3b {
    public static void main(String[] args) {
        double monthlySavings;
        double interestRate;
        double result;
        double interest;
        double monthint;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly savings amount: ");
        monthlySavings = input.nextDouble();
        System.out.println("Enter the yearly interest rate: ");
        interestRate = input.nextDouble();
        interest=interestRate/100;
        monthint=interest/12;
        result =monthlySavings+(monthlySavings*monthint);
        int counter=1;
            while (counter<6){
                System.out.println("After "+counter+" months, the account value is "+round(result,2));
                result =(result+monthlySavings)+((result+monthlySavings)*(monthint));
                counter += 1;
            }
            //I rounded each iterations so the final result is a couple of decimals off
        System.out.println("After 6 months, the account value is "+round(result,2));
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
