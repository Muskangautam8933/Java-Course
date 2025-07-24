import java.util.*;
public class demo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lets calculate the simple interest");

        System.out.print("Enter the principal amount :");
        int PA = sc.nextInt();

        System.out.print("Enter the rate of interest :");
        int rate = sc.nextInt();

        System.out.print("Enter the time :");
        int time = sc.nextInt();

        int simpleInterest = ((PA * rate * time)/100);
        System.out.println("The simple interest is : " + simpleInterest);
    }
}