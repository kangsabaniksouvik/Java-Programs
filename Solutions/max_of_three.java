//Program to check the maximum of three numbers
import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, great;
        System.out.println("Enter three numbers to check the greatest one: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        great = (a > b) ? (a > c ? a : c) : (b > c ? b : c);//ternary operation
        System.out.println("The maximum number among the given three numbers is: "+great);
        sc.close();
    }
}
