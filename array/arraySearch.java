
import java.util.Scanner;

public class arraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 4, 5, 6, 7, 9, 8};
        System.out.print("Please enter any number");
        int num = sc.nextInt();
        boolean isFound = searchInArray(arr, num);
        if(isFound){
            System.out.println("Your number was found in the array");
        }else{
            System.out.println("Your number was not found in the array");
        }

    }

    public static boolean searchInArray(int arr[] , int key){
        int index = 0;
        while(index < 7){
            if(arr[index] == key){
                return true;
            }
            index++;
        }
       return false;
    }
}
