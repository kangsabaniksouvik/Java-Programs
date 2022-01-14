//Program to find area and perimeter of rectangle
import java.util.Scanner;

public class ar_peri_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length, breadth, area, perimeter;
        System.out.println("Enter the length and breadth of the rectangle: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        area = length * breadth;
        perimeter = 2 *(length + breadth);
        System.out.printf("The area and the primeter of the rectangle is :\n"+"area: "+ area + " sq units\nperimeter: "+ perimeter +" sq units");
        sc.close();
    }
}
