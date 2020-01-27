import java.util.Scanner;
//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//round a double with an integer as a definer for the number of decimals.
public class Assignment6d {
    public static double round(double x, int n){
        int len=Integer.toString(n).length();
        double z = Math.pow(10,len-1);
        return Math.round(x*z)/z;
    }
    public static void main(String[] args) {
        double x;
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x: ");
        x=input.nextDouble();
        System.out.println("Enter n: ");
        n=input.nextInt();
        System.out.println(round(x,n));
    }
}
