//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//verifying if a int is divisible
import java.util.Scanner;

public class Assignment6a {
    public static boolean isDivisible(int n,int m){
        if (n%m==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        int m;
        Scanner input=new Scanner(System.in);
        System.out.println("Insert first integer: ");
        n=input.nextInt();
        System.out.println("Insert second integer: ");
        m=input.nextInt();
        System.out.println(isDivisible(n,m));

    }
}
