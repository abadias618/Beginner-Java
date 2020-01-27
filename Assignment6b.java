//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//max of 3 numbers function
import java.util.Scanner;

public class Assignment6b {
    public static int max(int a,int b,int c){
        if (a>b&&a>c)
            return a;
        else if (b>a&&b>c)
            return b;
        else return c;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input=new Scanner(System.in);
        System.out.println("Insert first number: ");
        a=input.nextInt();
        System.out.println("Insert second number: ");
        b=input.nextInt();
        System.out.println("Insert second number: ");
        c=input.nextInt();
        System.out.println("The largest number is: "+max(a,b,c));

    }

}
