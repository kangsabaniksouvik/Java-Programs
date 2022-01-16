//Program to check if the number is divisible by 5
import java.util.*;
public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to check: ");
        num = sc.nextInt();
        if(num % 5 == 0)
            System.out.print(num+" is divisible by 5");
        else
            System.out.print(num+" is not divisible by 5");
        sc.close();
    }
}
