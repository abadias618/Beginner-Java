//made this code by accident compares to strings to see if
// they are the same but in inverted order.
/*public class Assignment9bMirrorString {
    public static void main(String[] args) {
        System.out.println(areAnagrams("allen downey","well annoyed"));
    }

    public static boolean areAnagrams(String a, String b){
        String[] x=new String[a.length()];
        for (int i = 0; i <a.length() ; i++) {
            String[] s=a.split("");
            x[i]=s[i];
            System.out.println(x[i]);
        }

        String[] y=new String[b.length()];
        int j=0;
        for (int i =(b.length()-1); i!=-1 ; i--) {
            String[] s=b.split("");
            y[j]=s[i];
            System.out.println(y[j]);
            j++;
        }
        boolean result=false;
        int delimiter=0;
        if (x.length<=y.length)delimiter=x.length;
        else if (x.length>=y.length) delimiter=y.length;
        int count=0;
        while (x[count].equals(y[count])){
            count++;
            result=true;
            if (count==(delimiter-1))break;
        }


        return result;
    }
}*/
