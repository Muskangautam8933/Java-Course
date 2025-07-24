import java.util.*;
public class demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first num :");
        float num1 = sc.nextFloat();

        System.out.print("Please enter your second num :");
        float num2 = sc.nextFloat();

        float product = num1 * num2;
        System.out.println("Product of num1 and num2 is :" + product);

    }
}