//Program to count number of digits
import java.util.*;
public class digitcount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.print("There are "+count+" digits in the number.");
    }
    
}
