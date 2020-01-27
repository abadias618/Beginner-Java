//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//outputting amount of change from a quantity of money
import java.util.Scanner;
public class Assignment5b {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an Amount: ");
        float amount=input.nextFloat();
        int remainingAmount = (int)((amount+0.001) * 100);
        int numberOfOneDollars= remainingAmount/100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters= remainingAmount/25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes= remainingAmount/10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels= remainingAmount/5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of");
        if ((moreThan0(numberOfOneDollars))== true){
            System.out.println(numberOfOneDollars+ " dollar"+(plural(numberOfOneDollars)));
        }
        if ((moreThan0(numberOfQuarters))== true){
            System.out.println(numberOfQuarters+ " quarter"+(plural(numberOfQuarters)));
        }
        if ((moreThan0(numberOfDimes))== true){
            System.out.println(numberOfDimes+ " dime" +(plural(numberOfDimes)));
        }
        if ((moreThan0(numberOfNickels))== true){
            System.out.println(numberOfNickels + " nickel" +(plural(numberOfNickels)));
        }
        if ((moreThan0(numberOfPennies))== true){
            System.out.println(numberOfPennies + " pennie"+(plural(numberOfPennies)));
        }

    }
    public static String plural(int a){
        String x;
        if (a>1) x="s";
        else x="";
        return x;
    }
    public static boolean moreThan0(int a){
        boolean x;
        if (a>0) x=true;
        else x=false;
        return x;
    }
}
