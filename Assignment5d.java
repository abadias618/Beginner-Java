//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//rock paper scissors
import java.util.Random;
import java.util.Scanner;

public class Assignment5d {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Seed? ");
        int seed= input.nextInt();
        Random rndNum = new Random(seed);
        int computer = rndNum.nextInt(3);
        System.out.println("Rock(0), Paper(1), Scissors(2):");
        int in=input.nextInt();

        String out="";
            if (computer==0) {
                out = "Rock";
            }
            else if (computer==1){
                out = "Paper";
            }
            else if (computer==2) {
                out = "Scissors";
            }
        String you="";
        if (in==0) {
            you = "Rock";
        }
        else if (in==1){
            you = "Paper";
        }
        else if (in==2) {
            you = "Scissors";
        }
        String a="";
            if((in==0&&computer==2)||(in==1&&computer==0)||(in==2&&computer==1)){
                a="You win! :)";
            }
            else if ((in==0&&computer==1)||(in==1&&computer==2)||(in==2&&computer==0)){
                a="You lose! :(";
            }
            else if(in==computer){
                a="It is a draw";
            }

        System.out.println("The computer is "+out+". You are "+you+". "+a);
    }
}
