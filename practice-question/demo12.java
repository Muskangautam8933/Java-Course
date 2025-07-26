
import java.util.Scanner;

public class demo12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leap year or not");
        System.out.print("Enter any year :");
        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("Year is not a leap year");
        }
    }
}