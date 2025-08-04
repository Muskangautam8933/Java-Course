
import java.util.Scanner;

public class gcd{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Please enter first number :");
       int num1 = sc.nextInt();
        System.out.print("Please enter second number :");
       int num2 = sc.nextInt();
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1,num2);
        while(i <= least){
            if(num1 % 10 == 0 && num2 % 10 == 0){
                gcd = 1;
            }
        }
        return gcd;
        
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}