//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//is a word Abecedarian? iterative method
import java.util.ArrayList;

public class Assignment9b {
    public static void main(String[] args) {

        isAbecedarian("boost");
        isAbecedarian("chintz");
        isAbecedarian("glory ");
        isAbecedarian("almost");
        isAbecedarian("ghost");
        isAbecedarian("floor");
        isAbecedarian("first");
        isAbecedarian("empty");
        isAbecedarian("effort");
        isAbecedarian("chilly");
        //
        isAbecedarian("hello");
        isAbecedarian("hippo");
        isAbecedarian("raccoon");
        isAbecedarian("tiger");
        isAbecedarian("bike");
        isAbecedarian("soap");
        isAbecedarian("pencil");
        isAbecedarian("little");
        isAbecedarian("brown");
        isAbecedarian("mad");

    }
    public static void isAbecedarian(String a){
        String abc="abcdefghijklmnopqrstuvwxyz";
        String[] ab=abc.split("");
        String[] s=a.split("");
        //int j=0;
        int k=0;
        int q=0;
        boolean result=true;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 1; i <s.length+1 ; i++) {
            while (!s[i-1].equals(ab[q])){
                q++;
                if(q==26){
                    break;}
            }
            if (q==26)break;
            //
            list.add(i-1);
            list2.add(q);
            k=1;
            q=0;
            if(s.length==1&&i==1&&k==1){
             break;
            }
            else if (list.size()==1)continue;
            else if(s.length!=1&&list2.size()>0&&list2.get(i-1)<list2.get(i-2)){
            result=false;
            break;}
        }

        if (result==true) System.out.println(a+" is abecedarian");
        else  if (result==false) System.out.println(a+" is not abecedarrian");
    }
}
