
import java.util.Scanner;

public class demo11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greates of three number :");
        System.out.println("Enter A:");
        int a = sc.nextInt();
        
        System.out.println("Enter B:");
        int b = sc.nextInt();

        System.out.println("Enter C:");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("a Greatest number is :"+ a);
        }
        else if(b > a && b > c){
            System.out.println("b is Greatest number :"+ b);
        }
        else{
            System.out.println("c is greatest number :"+ c);
        }
    }
}