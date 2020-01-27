//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//power of a number using a for loop
import java.util.Scanner;
public class Assignment7b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter double x: ");
        double x=input.nextDouble();
        System.out.println("Enter integer n: ");
        double n=input.nextInt();
        double pow=1;
        for(int i=0;i<n;i++){
            pow*=x;
        }
        System.out.println(pow);
    }
}
