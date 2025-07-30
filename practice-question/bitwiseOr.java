
import java.util.Scanner;

public class bitwiseOr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number :");

        System.out.print("Enter your first number :");
        int first = sc.nextInt();

        System.out.print("Enter your second number :");
        int second = sc.nextInt();


        int result = first | second;
        System.out.println("Result is :" + result);
    }
}