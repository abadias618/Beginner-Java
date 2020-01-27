import java.util.Random;
import java.util.Scanner;
//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//comparing user input to a random number
public class IndividualAssesment2 {
    public static void main(String[] args) {
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt(100);
        System.out.println(randomNum);
        Scanner input=new Scanner(System.in);
        int guess;
        int i=0;
        while(true){
            System.out.println("Please enter a number between 1 and 100");
            guess=input.nextInt();
            if (guess>randomNum){
                System.out.println("Your number is too high. ");
                i+=1;
            }
            else if (guess<randomNum) {
                System.out.println("your number is too low. ");
                i+=1;
            }
            else if (guess==randomNum)
                break;
        }
        System.out.println("Your number is correct. You got that in "+i+" guesses");
    }
}
