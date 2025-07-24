
import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of a :");
        int a = sc.nextInt();

        System.out.print("Please enter the value of b :");
        int b = sc.nextInt();

        int add = a + b;
        System.out.println("The sum of a and b is :" + add);

        int diff = a - b;
        System.out.println("The difference of a and b is :" + diff);

        int mul = a * b;
        System.out.println("The mul of a and b is :" + mul);

        int div = a / b;
        System.out.println("The div of a and b is :" + div);

        int modulo = a % b;
        System.out.println("The modulo of a and b is :" + modulo);
    }
}
