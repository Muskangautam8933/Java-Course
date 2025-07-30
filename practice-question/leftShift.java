
import java.util.Scanner;

public class leftShift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number :");

        System.out.print("Enter your first number :");
        int num = sc.nextInt();

        


        int result = num << 1;
        System.out.println("Result is :" + result);
    }
}