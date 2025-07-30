
import java.util.Scanner;

public class bitwiseCompl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number :");

        System.out.print("Enter your first number :");
        int first = sc.nextInt();


        int result = ~first;
        System.out.println("Result is :" + result);
    }
}