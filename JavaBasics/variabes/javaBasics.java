//     System.out.println("***");
//     System.out.println("**");
//     System.out.println("*");

//   }
// }


//sum of 2 variable

// public class javaBasics {
//   public static void main(String args[]){
//     int a = 5;
//     int b = 10;
//     int sum = a + b;
//     System.out.println(sum);
//   }
// }

// //taking input in js
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine();
//     System.out.print(input);
//   }
// }

//sum of two numbers after input

// import java.util.Scanner;

// public class javaBasics{ 
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a + b;
//     System.out.println(sum);
//   }
// }


//product of two numbers after input

// import java.util.Scanner;

// public class javaBasics{ 
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int product = a * b;
//     System.out.println(product);
//   }
// }



//area of circle

import java.util.Scanner;

public class javaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    float area = 3.14f * radius * radius;
    System.out.println(area);
    
    sc.close();
  }
}

