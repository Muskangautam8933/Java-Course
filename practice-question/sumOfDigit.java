
import java.util.Scanner;

public class sumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();
        int sum = sumDigit(num);
        System.err.println("Sum of digits are :" + sum);

    }
    public static int sumDigit(int num){
       int sum = 0;
       while(num > 0){
        sum += num % 10;
        num /= 10 ;
       }
       return sum;
    }
}















// import java.util.Scanner;
// public class sumOfDigit{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter any number :");
//         int num = sc.nextInt();
//         int sum = sumOfDigit(num);
//         System.out.println("Sum of digit :" + sum);

//     }
//     public static int sumOfDigit(int num){
//        int sum = 0;
//        while(num > 0){
//         sum += num % 10;
//         num /= 10;
//        }
//        return sum;
//     }
// }