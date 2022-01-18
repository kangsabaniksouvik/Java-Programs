//Program to check a Buzz no
import java.util.*;

public class buzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check;
        System.out.print("Enter the nuumber to check for Buzz no: ");
        check = sc.nextInt();
        if(check % 10 == 0 || check % 7 == 0)
            System.out.println(check +" is a Buzz number");
        else
            System.out.println(check +" is not a Buzz number");
        sc.close();
    }
}