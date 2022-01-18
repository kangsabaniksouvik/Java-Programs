//Program to check factorial of number
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1, num, i;
        System.out.print("Enter the number whose factorial you want to know: ");
        num = sc.nextInt();
        for(i=1;i<=num;i++)
            fact = fact*i;
        System.out.println("Factorial of "+ num + " is "+fact);
        sc.close();
    }
}
