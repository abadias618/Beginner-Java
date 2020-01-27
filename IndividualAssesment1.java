//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//calculating retirement based on current year
import java.util.*;

public class IndividualAssesment1 {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        Scanner input=new Scanner(System.in);
        System.out.println("What is your current age?: ");
        int age =input.nextInt();
        System.out.println("At what age would you like to retire?: ");
        int retire =input.nextInt();
        int retireAge= retire-age;
        System.out.println("You have "+retireAge+" years left until you can retire.");
        int retireYear=year+retireAge;
        System.out.println("It's "+year+" , so you can retire in "+retireYear+".");

    }
}
