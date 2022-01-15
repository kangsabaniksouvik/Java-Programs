//Program to swap two numbers
import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, swap;
        System.out.println("Enter two numbers to swap: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Numbers before swapping:\nA: "+ a +"\nB: "+ b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("Numbers after swapping:\nA: "+ a +"\nB: "+ b);
        sc.close();
    }
}