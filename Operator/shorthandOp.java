
import java.util.Scanner;

public class shorthandOp {

    public static void main(String[] args) {

        //   += :Addition in assignment
        //   -= :Subtraction in assignment
        //   *= :Multiplication in assignment
        //   /= :Division in assignment
        //   %= :Modulo in assignment
        int a = 5;
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        a += x1;
        System.out.println(a);

        int x2 = sc.nextInt();
        a -= x2;
        System.out.println(a);

        int x3 = sc.nextInt();
        a *= x3;
        System.out.println(a);

        int x4 = sc.nextInt();
        a /= x4;
        System.out.println(a);

        int x5 = sc.nextInt();
        a %= x5;
        System.out.println(a);
    }
}
