import java.util.ArrayList;
import java.util.Scanner;
//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//finding the times a number is reapeated in a user input

public class Assignment8b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> numArray=new ArrayList<Integer>();
        int in=1;
            while (in!=0){
                System.out.println("Enter integers between 1 and 100: ");
                in =input.nextInt();
                if (in<1||in>100) {
                    System.out.println("please enter only integers between 1 and 100: ");
                    continue;
                }
                numArray.add(in);
            }
        System.out.println("thanks");
        int a=0;
        int b=0;
        int counter=1;
        ArrayList<Integer> repeat=new ArrayList<Integer>();
        for (int i = 0; i < numArray.size(); i++) {
            a=numArray.get(i);
            if (repeat.contains(a))continue;
            else repeat.add(a);
            for (int j=1; j < numArray.size(); j++) {
                b=numArray.get(j);
                if (a==b) {
                    counter++;
                }
            }
            plural(a,counter);
            counter=0;
        }

    }
    public static void plural(int a,int counter){
        if (counter>1){
            System.out.println(a+" occurs "+counter+" times.");
        }
        else if (counter==1){
            System.out.println(a+" occurs "+counter+" time.");
        }
    }
}
