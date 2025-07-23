public class unary{
    public static void main(String[] args) {
       //(-) : convert positive to negative and negative to positive
  
      int x = 5;
      int y= -x;
      System.out.println(y); 

      //x = ++y : pre increment operator it increment the value by 1 and then use it in our statement
      int a = 6;
      ++a;
      System.out.println(a);
      //x = y++ : post increment operator use current value in the statement and then increment it by 1
       int b = 6;
       b++;
       System.out.println(b);
      // x = --y : pre decrement operator it decrement the value by 1 and then use it in our statement
       int c = 6;
      c--;
      System.out.println(c);
      // x = y-- : post decrement operator use current value in the statement and then decrement it by 1
       int d = 6;
      --d;
      System.out.println(d);
    }
}