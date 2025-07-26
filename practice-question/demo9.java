
import java.util.Scanner;

public class demo9{
    public static void main(String[] args) {
        //write a program to check number is positive negative aur zero
        Scanner sc = new Scanner(System.in);
        System.err.println("To Check number is positive negative or zero");
        System.err.print("Please enter the value of a :");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Number is Positive :" + a); 
        }
        else if(a < 0){
            System.err.println("Number is Negative :" + a);
        }
        else if(a ==  0){
            System.err.println("Number is zero :" + a);
        }

    }
}
