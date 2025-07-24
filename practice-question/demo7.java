import java.util.*;
public class demo7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets find the compund interest :");

        System.out.print("Enter principle amount :");
        int PA = sc.nextInt();

        System.out.println("Enter rate of interest :");
        int R = sc.nextInt();

        System.out.println("Enter time :");
        int T = sc.nextInt();

       int CI = (int)(PA * Math.pow((1 + R / 100.0), T) - PA);
        System.err.println("The compund interest is : " + CI);
    }
}