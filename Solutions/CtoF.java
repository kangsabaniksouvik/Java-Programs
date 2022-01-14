//Program to convert Celcius to Fahrenheit degrees
import java.util.Scanner;

public class CtoF{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float farh, cel;
        System.out.print("Enter the temperature in Celsius degree:");
        cel = sc.nextFloat();
        farh = ((cel * 9)/5)+ 32;
        System.out.print("The temperature in Fahrenheit degree is: " +farh);
        sc.close();
    }
}