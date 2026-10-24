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

// public class syntax{
//   public static int calculate(int a, int b){
//    int one = a;
//    int two = b;
//     int sum = one + two;
//     return sum;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = calculate(a, b);
//     System.out.println("sum of a and b: " + sum);
//   }
// }

//find product of A and B using method- 

// public class syntax{
//   public static int multi(int a, int b){
//     int one = a;
//     int two = b;
//     int product = one * two;
//     return product; 
//   }
//   public static void main(String args[]){


//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int product = multi(a,b);
//     System.out.println("product of a and b is: " + product);
//   }
// }



//writing factorial using method

public class syntax{

  public static int factorial(int num){
    int n = num;
    int fact = 1;
    for(int i = n; i>0;i--){
      fact = fact *i;
    }
    return fact;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result = factorial(num);
    System.out.println("factorial of a is: " + result);
  }
}