//Program to check whether the number is odd or even
import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input;
        System.out.print("Enter the number to be checked: ");
        input = sc.nextInt();
        if (input % 2 == 0)
            System.out.println(input +" is even.");
        else
            System.out.println(input +" is odd.");
        sc.close();
    }
}
