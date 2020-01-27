//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//clasifying by age
import java.util.Scanner;
public class Assignment5c {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Age: ");
        int age=input.nextInt();
        System.out.println("Gender(m/f): ");
        String gender=input.next();
        if (age<1){
            System.out.println("Babe in arms.");
        }
        else if (age>=1&&age<3){
            System.out.println("Nursery.");
        }
        else if (age>=3&&age<12){
            System.out.println("Primary.");
        }
        if (gender.equals("m")){
            if (age>=12&&age<18){
                System.out.println("Young Mens.");
            }
            else if (age>=18){
                System.out.println("Elders Quorum.");
            }
        }
        if (gender.equals("f")){
            if (age>=12&&age<18){
                System.out.println("Young Womens.");
            }
            else if (age>=18){
                System.out.println("Relief Society.");
            }
        }
    }
}
