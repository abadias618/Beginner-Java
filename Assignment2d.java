import java.lang.Math;

public class Assignment2d {
    //ALBERTO ABDIAS BALDIVIEZO
    //SECTION 01
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double perimeter = (width * 2) + (height * 2);
        double area = width * height;
        System.out.println("perimeter is: " + perimeter);
        System.out.println("area is: "+ Math.round(area));
        System.out.println("area is: "+ area);
        System.out.printf("Value with 3 digits after decimal point %.3f %n", area);
    }
}
