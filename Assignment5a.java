//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//using random and sum
import java.util.Random;
import java.util.Scanner;
public class Assignment5a {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Seed? ");
        int seed= input.nextInt();
        Random rndNum = new Random(seed);
        int num1 = rndNum.nextInt(25);
        int num2 = rndNum.nextInt(25);
        int num3 = rndNum.nextInt(25);
        int num4 = rndNum.nextInt(25);
        System.out.println("What is "+num1+" "+num2+" "+num3+" "+num4+"?");
        int result= input.nextInt();
        int sum=num1+num2+num3+num4;
        if (result==sum){
            System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+" is True");
        }
        else{
            System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+" is False");
        }
    }




}
