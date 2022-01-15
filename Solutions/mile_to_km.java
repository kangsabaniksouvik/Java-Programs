//Program to convert miles to kilometres
import java.util.Scanner;

public class mile_to_km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mile, km;
        System.out.print("Enter the distance in terms of miles: ");
        mile = sc.nextDouble();
        km = mile * 1.6;
        System.out.print("The given distance in terms of kilometres: "+ km +" kms");
        sc.close();
    }
}
