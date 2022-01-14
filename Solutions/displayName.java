//Program to display user input name
import java.util.Scanner;

public class displayName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("You entered: "+ name);
        sc.close();
    }
}