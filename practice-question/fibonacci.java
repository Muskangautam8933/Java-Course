//write a program to print fibonacci series fibonacci series means 0 1 1 2 3 5 8 13 = 0 and 1 ke baad sare number previos two number ka sum ho
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any num :");
        int num = sc.nextInt();
        System.out.print("here is your fibonacci series : ");
        printFibonacciSeries(num);


    }
    public static void printFibonacciSeries(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0)return ;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}