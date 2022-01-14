//Program to add two numbers
import java.util.Scanner;

public class addition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, sum =0;
        System.out.println("Enter two numbers:");
        a= sc.nextInt();
        b= sc.nextInt();
        sum = a+ b;
        System.out.println("The sum is: "+sum);
        sc.close();
    }
}
