
//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//Tic Tac Toe
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment8c {
    public static void main(String[] args) {
        System.out.println("insert");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter user 1: ");
        String player1=input.next();
        System.out.println("Enter user 2: ");
        String player2=input.next();
        System.out.println("  a  b  c");
        System.out.println("1[ ][ ][ ]");
        System.out.println("2[ ][ ][ ]");
        System.out.println("3[ ][ ][ ]");
        //turns
        int condition=0;
        int counterPlayer=2;
        String player="";
        int whichPlayer=0;
        //switch between players
        //arrays
        String[][] stringTic=new String[3][3];
        for (int row = 0; row <stringTic.length ; row++) {
            for (int column = 0; column <stringTic[row].length ; column++) {
                stringTic[row][column]=" ";
            }
        }
        int[][] ticTac=new int[3][3];
        ArrayList<String> moves=new ArrayList<>();
        while(condition==0){

            if(counterPlayer%2==0){
                player=player1;
                whichPlayer=1;
            }
            else if(counterPlayer%2==1){
                player=player2;
                whichPlayer=2;
            }
            //
            int exit=0;
            String x="";
            String yy="";
            int y=0;
            int validation=0;

            while (exit==0){

                System.out.println(player+"'s move:");
                String move=input.next();
                //parse move and validation
                String[] s=move.split("");
                x=s[0];
                if(x.equals("a")||x.equals("b")||x.equals("c")){validation=1;}
                else {validation=2;
                    System.out.println("enter a comand in a format letter/number\n Ex. a1,b2,c3");
                    continue;
                }
                yy=s[1];
                if(yy.equals("1")||yy.equals("2")||yy.equals("3")){validation=1;}
                else {validation=2;
                    System.out.println("enter a comand in a format letter/number\n Ex. a1,b2,c3");
                    continue;
                }


                if(!moves.contains(move)){
                    if(validation==1){moves.add(move);}
                    exit=1;}
                else if(moves.contains(move)){System.out.println("That's a taken space");
                continue;}
                y=Integer.parseInt(yy);
            }


            int[][]res=insert(stringTic,ticTac,whichPlayer,x,y);
            if ( checkHorizontal(res)==1||
                    checkVertical(res)==1||
                    checkDRight(res)==1||
                    checkDLeft(res)==1){
                System.out.println(player+" wins!");
                condition=1;}
            else if ( checkHorizontal(res)==2||
                    checkVertical(res)==2||
                    checkDRight(res)==2||
                    checkDLeft(res)==2){
                System.out.println(player+" wins!");
                condition=1;}
            //determine end
            int end=0;
            for (int row = 0; row <stringTic.length ; row++) {
                for (int column = 0; column <stringTic[row].length ; column++) {
                    if(stringTic[row][column].isBlank()){end=1;}
                    else if (!stringTic[row][column].isBlank()&&column!=2&&row!=2){end=2;}
                    else if (!stringTic[2][2].isBlank()&&end==2){end=3;}
                }
            }
            if(end==3){
                System.out.println("Game Over!, it's a tie...");
                break;}
            //
            counterPlayer++;
        }

    }
    public static int[][] insert(String[][] stringTic, int[][] ticTac, int whichPlayer, String x, int y){
        // translate a string to an int for y coordinate
        int z=0;

        if(x.equals("a")){z=0;}
        else if(x.equals("b")){z=1;}
        else if(x.equals("c")){z=2;}
        //depending on player to print array
        String symbol="";
        if(whichPlayer==1){
            symbol="X";
        }
        else if(whichPlayer==2){
            symbol="O";
        }
        //

        if(y==1){y=0;}
        else if(y==2){y=1;}
        else if(y==3){y=2;}

        stringTic[y][z]=symbol;
        //print array
        System.out.println("  a"+"  b"+"  c");
        String rowPrint="";
        int rowNum=1;
        for (int row = 0; row <stringTic.length ; row++) {
            for (int column = 0; column <stringTic[row].length ; column++) {
                rowPrint+="["+stringTic[row][column]+"]";
                if(column==2){
                    System.out.println(rowNum+rowPrint);
                    rowPrint="";
                    rowNum++;
                }
            }
        }
        //insert into another array for checking
        int numSymbol=0;
            if(whichPlayer==1){
                numSymbol=1;
            }
            else if(whichPlayer==2){
                numSymbol=5;
            }
        ticTac[y][z]=numSymbol;

        return ticTac;
    }


    public static int checkHorizontal(int[][] array){
        int sum=0;
        int ret=0;
        for (int row = 0; row <array.length; row++) {
            for (int column = 0; column <array[row].length ; column++) {
                sum+=array[row][column];
                if (column==2){
                    if (sum==3){
                        ret=1;
                    }
                    else if (sum==15){
                        ret=2;
                    }
                }
            }
            sum=0;
        }
        return ret;
    }
    public static int checkVertical(int[][] array){
        int sum=0;
        int ret=0;
        for (int row = 0; row <array.length; row++) {
            for (int column = 0; column <array[row].length ; column++) {
                sum+=array[column][row];
                if (column==2){
                    if (sum==3){
                        ret=1;
                    }
                    else if (sum==15){
                        ret=2;
                    }
                }
            }
            sum=0;
        }
        return ret;
    }
    public static int checkDRight(int[][] array){
        int ret=0;
        if (array[0][0]+array[1][1]+array[2][2]==3){
            ret=1;
        }
        else if (array[0][0]+array[1][1]+array[2][2]==15){
            ret=2;
        }
        return ret;
    }
    public static int checkDLeft(int[][] array){
        int ret=0;
        if (array[0][2]+array[1][1]+array[2][0]==3){
            ret=1;
        }
        else if (array[0][2]+array[1][1]+array[2][0]==15){
            ret=2;
        }
        return ret;
    }
}
