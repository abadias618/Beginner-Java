import java.util.ArrayList;
import java.util.Collections;

//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//Anagrams
public class Assignment9a {
    public static void main(String[] args) {
        areAnagrams("allen   downey","wellannoyed");
        areAnagrams("tar","rat");
        areAnagrams("arc","car");
        areAnagrams("elbow","below");
        areAnagrams("state","taste");
        areAnagrams("cider","cried");
        areAnagrams("dusty","study");
        areAnagrams("night","thing");
        areAnagrams("inch","chin");
        areAnagrams("0 1234567890123456789012345678901234567890123456789",
                "7 89456123078945612307894    56123078945612307894561230");
        //
        areAnagrams("allen downey","well annoyex");
        areAnagrams("tar","rast");
        areAnagrams("arc","cadr");
        areAnagrams("elbow","beledow");
        areAnagrams("state","tasfaete");
        areAnagrams("cider","crifased");
        areAnagrams("dusty","stfghudy");
        areAnagrams("night","thyting");
        areAnagrams("inch","chifhn");
        areAnagrams("0 1234567890123456789012345678901234567890123456789",
                "7 89456123078945612307894656123078945612307894561230");


    }

    public static void areAnagrams(String a, String b){
        ArrayList<String> x=new ArrayList<>();
        for (int i = 0; i <a.length() ; i++) {
            String[] s=a.split("");
            if (s[i].isBlank()){
                continue;
            }
            else x.add(s[i]);
        }
        Collections.sort(x);

        ArrayList<String> y=new ArrayList<>();
        for (int i = 0; i <b.length() ; i++) {
            String[] s=b.split("");
            if (s[i].isBlank()){
                continue;
            }
            else y.add(s[i]);
        }

        Collections.sort(y);

        int count=0;
        boolean result=false;
        int delimiter;

        if (x.size()==y.size()){
            delimiter=x.size();
            while (x.get(count).equals(y.get(count))){
                if (count==(delimiter-1)){
                    result=true;
                    break;
                }
                count++;
            }
        }
        else result=false;

        if (result==true) System.out.println(a+" & "+b+" are anagrams");
        else  if (result==false) System.out.println(a+" & "+b+" are not anagrams");
    }
}
