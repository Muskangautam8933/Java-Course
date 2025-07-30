
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int num = sc.nextInt();
        long fact = factorialNum(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static long factorialNum(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
