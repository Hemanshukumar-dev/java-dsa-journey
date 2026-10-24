package functions;

import java.util.Scanner;
//basic function code
// public class syntax{

//   public static void printHellowWorld(){
//     System.out.println("hello world");
//     System.out.println("hello world");
//     System.out.println("hello world");
//   }
//   public static void main(String args[]){
//     printHellowWorld();
//   }
// }


//using parameters for methods.

public class syntax{
  public static int calculate(int a, int b){
   int one = a;
   int two = b;
    int sum = one + two;
    return sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculate(a, b);
    System.out.println("sum of a and b: " + sum);
  }
}