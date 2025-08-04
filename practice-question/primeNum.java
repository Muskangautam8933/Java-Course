
import java.util.Scanner;

//prime number are those number which are  divide by itself.
public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();
        boolean isPrime = printPrimeNum(num);
        if(isPrime){
            System.out.println("Your Number is prime");
        }else{
             System.out.println("Your Number is not prime");
        }
    }

    public static boolean printPrimeNum(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}
