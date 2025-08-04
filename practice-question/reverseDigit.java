//reverse the digit program means 3456788 ko 8876543 me change kroo
import java.util.Scanner;
public class reverseDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();
        int reverse = printReverseDigit(num);
        System.out.println("Reverse of a number is : "+ reverse );


    }
    public static int printReverseDigit(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10; 
        }
        return newNum;

    }
}