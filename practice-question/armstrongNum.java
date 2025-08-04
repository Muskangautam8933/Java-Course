//write a program to check armstrong number means let asume a number 153 ther is a three digit the jitni digit hai utne power lga kr sum kro to originall number ke equal hoga

import java.util.Scanner;

public class armstrongNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number to print armstrongNum :");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is armstrong");
        }else{
             System.out.println("Your number is not armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
       return false;

    }
}
