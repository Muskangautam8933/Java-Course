
import java.util.Scanner;

public class  demo14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the age group:");
        System.out.print("Please enter your age :");
        int age = sc.nextInt();
        
        if(age <= 0){
            System.out.println("Invalid age entered.");
        }
        else if(age <= 13){
            System.out.println("You are child so you don't have any access");
        }
        else if(age <= 20){
            System.out.println("You are a teen ager");
        }
        else if(age <= 60){
            System.out.println("You are Adult");
        }
        else{
            System.out.println("You are senior");
        }
    }
}