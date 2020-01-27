//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//display date format using methods

public class Assignment4a {
    public static void main(String[] args){
        int year = 2019;
        String month = "January";
        int day= 29;
        String dayweek="Tuesday";
        System.out.println("Year: "+year+"\nMonth: "+month+"\nDay: "+day+"\nDay of the Week: "+dayweek+"\n");
        printAmerican(year,month,day,dayweek);
        printEuropian(year,month,day,dayweek);
    }
    public static void printAmerican(int year, String month,int day, String dayweek){
        System.out.println("American format: \n"+
        dayweek+","+month+" "+day+","+year+"\n");
    }
    public static void printEuropian(int year, String month,int day, String dayweek){
        System.out.println("Europian format: \n"+
                dayweek+" "+day+" "+month+" "+year+"\n");
    }
}
