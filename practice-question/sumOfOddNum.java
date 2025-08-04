
import java.util.Scanner;


public class sumOfOddNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int num = sc.nextInt();
        int sum = sumOFOdd(num);
        System.out.println("Odd sum till "+ num + "is :" + sum);
    }
    public static int sumOFOdd(int num){
       int sum = 0;
       int i = 1;
       while(i <= num){
        sum += i;
        i += 2;

       }
       return sum;

    }
}











// import java.util.Scanner;

// public class sumOfOddNum{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Welcome to sum of odd number calculator : ");
//         System.out.print("Please enter any numbe:");
//         int num = sc.nextInt();
//         int sum = sumOfOddNum(num);
//         System.out.println("OddSum till " + num + " is : " + sum);

//     }

//     public static int sumOfOddNum(int num){
//        int sum = 0;
//        int i = 1;
//        while(i <= num){
//         sum += i;
//         i += 2;
//        }
//        return sum;

//     }
// }