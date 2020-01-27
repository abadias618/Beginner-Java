//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//passing int through multiple methods

import java.util.Scanner;

public class Assignment4c {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("How many snarks to start with?: ");
        int startingSnarks=input.nextInt();
        snark(startingSnarks);
    }
    public static void snark(int numSnarks){
        numSnarks++;
        System.out.println(numSnarks);
        moreSnarks(numSnarks);
    }
    public static void moreSnarks(int multiSnarks){
        multiSnarks=multiSnarks+10;
        System.out.println(multiSnarks);
        powerSnarks(multiSnarks);
    }
    public static void powerSnarks(int lotsOfSnarks){
        lotsOfSnarks=lotsOfSnarks*lotsOfSnarks*lotsOfSnarks*lotsOfSnarks*lotsOfSnarks;
        System.out.println(lotsOfSnarks);

    }
}
