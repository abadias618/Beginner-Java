//ALBERTO ABDIAS BALDIVIEZO
//CS114
//SECTION 01
//Area and Volume of a Cylinder
import java.util.Scanner;
public class Assignment3a {
    public static void main(String[] args){
    double radius;
    double length;
    double area;
    double volume;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the the radius: ");
    radius =input.nextDouble();
    System.out.println("Please enter the the radius: ");
    length =input.nextDouble();
    area=radius*radius*Math.PI;
    volume=area*length;
    System.out.println("Radius: "+radius);
    System.out.println("Length: "+length);
    System.out.println("Area: "+round(area,1));
    System.out.println("Volume: "+round(volume,1));

    }
    //method to round doubles to n places
    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
