//Program to print a candidate's eligibility
import java.util.*;
public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy, che, math;
        System.out.println("Enter the marks: ");
        System.out.print("Maths: ");
        math = sc.nextInt();
        System.out.print("Physics: ");
        phy = sc.nextInt();
        System.out.print("Chemistry: ");
        che = sc.nextInt();
        if((phy+math+che)>=200||(phy+math)>=150)
            System.out.print("Eligible");
        else
            System.out.print("Not eligible");
    }
}
