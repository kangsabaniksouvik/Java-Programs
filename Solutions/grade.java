//program to find the grade

import java.util.*;
public class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float percentage;
        String grade;
        System.out.println("Enter the percentage to check: ");
        percentage = sc.nextFloat();
        if(percentage>=90)
            grade = "A";
        else if(percentage >=80 && percentage<90)
            grade = "B";
        else if(percentage >=60 && percentage<80)
            grade = "C";
        else if(percentage >=40 && percentage<60)
            grade = "D";
        else
            grade = "E";
        System.out.println("The grade is: "+grade);
        sc.close();
    }
}