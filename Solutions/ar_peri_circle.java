//Program to find the area and perimeter of circle
import java.util.Scanner;

public class ar_peri_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area, perimeter;
        System.out.print("Enter the radius of the given circle: ");
        radius = sc.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;
        System.out.println("The area and perimeter of the circle is:\narea: "+ area +"\nperimeter: "+ perimeter);
        sc.close();
    }
}
