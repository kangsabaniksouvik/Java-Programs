//Program to find reverse of a number
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n, rev =0;
        System.out.print("Enter the number to be reversed: ");
        num = sc.nextInt();
        while(num != 0){
            n = num % 10;
            rev = rev * 10+ n;
            num = num / 10;
        }
        System.out.print("Reverse of the number is: "+ rev);
    }
}
