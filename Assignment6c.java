//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//power of a number using recursion
import java.util.Scanner;
public class Assignment6c {
    public static double power(double x, int n){
        if (n==1)
            return x;
        else if (n==0)
            return 1;
        else
            return x*power(x,n-1);
    }

    public static void main(String[] args) {
        double x;
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Insert the Base: ");
        x=input.nextDouble();
        System.out.println("Insert the exponent: ");
        n=input.nextInt();
        System.out.println("The power of "+x+" elevated to "+n+" is: "+power(x,n));
    }
}
