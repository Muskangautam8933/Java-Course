
import java.util.Scanner;

public class demo3{
    public static void main(String[] args) {
        System.out.println("please enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
    }
}