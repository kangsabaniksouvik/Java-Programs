//Program to print Fibonacci series
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term, i, a=0, b=1, c;
        System.out.print("Enter the no. of erms (from 1st) upto which you want to know Fibonacci series: ");
        term = sc.nextInt();
        System.out.println("First "+term+" terms: ");
        for(i=0;i<term;i++){
            if(i == term -1)
                System.out.print(a+" ");
            else
                System.out.print(a+" , ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
