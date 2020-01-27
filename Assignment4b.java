//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//show time after calculating seconds from an input

import java.util.Scanner;
public class Assignment4b {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Number of Seconds?: ");
        int seconds= input.nextInt();
        secondsformat(seconds);
    }
    public static  void secondsformat(int numsec){
        int minutes =numsec/60;
        int remainingminutes=minutes%60;
        int hours = minutes/60;
        int remainingseconds = numsec%60;
        System.out.println("Current time is :\n"+hours+":"+remainingminutes+":"+remainingseconds);

    }
}
