import java.util.Scanner;

public  class multiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter any number :");
        int num =  sc.nextInt();
        multiplicationTableProgram(num);

    }
    public static void multiplicationTableProgram(int num){
       int i = 1;
       while(i <= 10){
          System.out.println(num + " X " + i + " = " + (num*i));
           i++;
       }
    }
}
























// import java.util.Scanner;

// public class multiplicationTable{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter any number :");
//         int num = sc.nextInt();
//         multiplicationTableP(num);
//     }

//     public static void multiplicationTableP(int num){
//        int i = 1;
//        while(i <= 10){
//         System.out.println(num + " X " + i + " = " + ( num * i ));
//         i++;
//        }

//     }
// }





























// import java.util.Scanner;

// public class function1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter any number :");
//         int num = sc.nextInt();
//         multiplicationTable(num);

//     }

//     public static void multiplicationTable(int num){
//         int i = 1;
//         while(i < 10){
//             System.out.println(num + " X " + i +" = " + (num*i));
//             i++;
//         }
        
//     }

// }