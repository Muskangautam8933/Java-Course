import java.util.*;
public class demo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter temperature in fahrenheit :");
        double fahrenheit = sc.nextDouble();

       double celsius =((fahrenheit - 32) * 5 / 9);

        System.out.println("The temperature in celsius is : " + celsius);
    }
}