import java.util.*;
public class demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lets find the area of reactangle :");

        System.out.print("Enter height :");
        int height = sc.nextInt();

        System.out.print("Enter width :");
        int width = sc.nextInt();

        int areaOfReactangle = ((height * width)/1/2);
        System.out.println("The area of reactangle is : " + areaOfReactangle);
    }
}