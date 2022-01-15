//Program to check whether a year is leap year or not
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr;
        boolean leapcheck;
        System.out.print("Enter the year to be checked: ");
        yr = sc.nextInt();
        if (yr % 4 == 0){
            if (yr % 100 == 0){
                if (yr % 400 == 0)
                    leapcheck = true;
                else
                    leapcheck = false;
            }
            else
                leapcheck = true;
        }
        else
            leapcheck = false;

        if(leapcheck)
            System.out.println(yr + " is a leap year.");
        else
            System.out.println(yr + " is not leap year");
        sc.close();
    }
}
