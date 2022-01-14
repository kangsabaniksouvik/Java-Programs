//Program to convert Fahrenheit to Celcius degrees
import java.util.Scanner;

public class FtoC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float fahr, cel;
        System.out.print("Enter the temperature in Fahrenheit degree:");
        fahr = sc.nextFloat();
        cel = ((fahr - 32)* 5)/ 9;
        System.out.print("The temperature in Celcius degree is: "+cel);
        sc.close();
    }
}
