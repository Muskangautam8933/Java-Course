import java.util.Scanner;
public class practice1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping of two number program");
        System.out.print("Please enter your first number :");
        int a = sc.nextInt();
        System.out.print("Please enter your second number :");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
    }
}