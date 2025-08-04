
import java.util.Scanner;

public class leastCommonMultiple{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please first any number :");
        int first = sc.nextInt();
        System.out.print("Please enter second number :");
        int second = sc.nextInt();
        int lcm = LCM(first,second);
        System.out.println("Least Common Multiple:"+lcm);

    }
    public static int LCM(int first , int second){
         int i = 1;
         while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
         }
         return 0;
    }
}