
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        System.out.print("Please enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("welcome " + age);
    }
}
