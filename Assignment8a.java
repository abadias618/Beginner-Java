import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//finding the maximum of an array of integers
public class Assignment8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seed: ");
        int seed = input.nextInt();
        Random rndNum = new Random(seed);
        System.out.println("number of ints: ");
        int totalNum = input.nextInt();
        int[] arrayNum=new int[totalNum];
        int i;
        for (i=0;i<totalNum;i++){
            arrayNum[i]=rndNum.nextInt();
        }
        System.out.println("This is the array"+Arrays.toString(arrayNum));

        int a;
        int b;
        for (int j=0;j<arrayNum.length;j++) {
            a=arrayNum[j];
            int counter=0;
            for (int k=1;k<arrayNum.length;k++) {
                b=arrayNum[k];
                counter++;
                if (a<b) break;
                else if (a>b) continue;
            }
            if (counter==arrayNum.length-1) {
                System.out.println("Max is: "+a);
                break;
            }
        }
    }
}
