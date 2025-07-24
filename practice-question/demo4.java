import java.util.*;
public class demo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets find the parameter of reactangle :");

        System.out.print("Enter A :");
        int A = sc.nextInt();

        System.out.print("Enter B :");
        int B = sc.nextInt();

        System.out.print("Enter C :");
        int C = sc.nextInt();

        System.out.print("Enter D :");
        int D = sc.nextInt();

        int parameter = 2 * (A + B + C + D);
        System.out.println("The parameter of reactangle is : " + parameter);
    }
}