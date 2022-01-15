//Program to check whether a number is positive or negative
import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Enter a number:");
        input = sc.nextInt();
        if(input < 0)
            System.out.print(input + " is negative.");
        else
            System.out.print(input + " is positive.");
        sc.close();
    }    
}
