import java.util.*;

//sum of first N numbers
// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int sum = 0;
//     for(int i =0; i <=num; i++){
//       sum += i;
//     }
//     System.out.println(sum);
//   }
// }


//print * pattern in reducing manner. 
// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     for(int i = num; i>0; i--){
//       for(int j =0; j < i; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


//Reverse of a number 

// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int rev = 0;
//     while(num > 0){
//     int lastDigit = num % 10;
//     rev = rev * 10 + lastDigit;
//     num = num/10;
//   }
//   System.out.println(rev); 
//   }
// }

//using BREAK ; checking if user given num is multiple of 10;
// public class loop{
//   public static void main(String[] args){
//   while(true){ 
//      Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     if(num % 10 == 0){
//       break;
//     }
//     System.out.println(num);
//   }
//   }
// }

//using CONTINUE ; skip the number
// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the N till which we have to print: ");
//     int num = sc.nextInt();
//     System.out.println("Enter the number you want to skip");
//     int leave = sc.nextInt();
//     for(int i = 0; i < num; i++){
//       if(i == leave){
//         continue;
//       }
//       System.out.print(i);
//     }

//   }
// }


//using CONTINUE; print every number user gave except multiple of 10;
// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     while(true){
//       System.out.println("Enter the number: ");
//       int num = sc.nextInt();
//       if(num % 10 == 0){
//         continue;
//       }
//       if(num == 7){
//         break;
//       }
//       System.out.println(num);
//     } 
//   }
// }


//Checking if a number is prime or not.
// public class loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     boolean isprime = true;
//     if(num == 2){
//       System.out.println("2 is a prime number");
      
//     }
//     else{
//       for(int i = 2; i <num-1; i++){
//         if(num % i == 0){
//           isprime = false;
//         }
//       }
//     }
//     if( isprime == true){
//       System.out.println(num +" is a prime");
//     }
//     else{
//       System.out.println(num + " is not a prime");
//     }
//   }
// }


//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// public class loop{
//   public static void main(String[] args){
//     int number;
//     int evennum = 0;
//     int oddnum = 0;
//     int choice;

//     Scanner sc = new Scanner(System.in);
//     do{
//       number = sc.nextInt();
//       if(number % 2 == 0){
//         evennum += number;
//       }
//       else{
//         oddnum += number;
//       }

//       System.out.println("if you want to continue press 1 , if you want to stop press 0");

//       choice = sc.nextInt();
//     }while(choice == 1);


//     System.out.println("sum of all odd numbers is " + oddnum);
//     System.out.println("sum of all odd numbers is " + evennum);
//   }
// }


// Write a program to find the factorial of any number entered by the user.

// public class loop{
//   public static void main(String[] args){
//     int num;
//     int fact =1 ;
//     Scanner sc = new Scanner(System.in);
//     num = sc.nextInt();
//     for(int i = num; i > 0; i--){
//       fact = fact *i;
//     }
//     System.out.print(fact);
//   }
// }


// Write a program to print the multiplication table of a number N, entered by the user.

public class loop{
  public static void main(String[] args){
    int num;
    int mul = 1;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(int i = 1; i <= 10; i++){
      mul = num *i;
      System.out.println(num+" X " + i+ " = " + mul);
    }
  }
}