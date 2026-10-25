package functions;

import java.util.*;

//writing basic overloading code
// public class overloading{
//   public static int sums(int a, int b){
//     return a + b;
//   }
//   public static int sums(int a, int b, int c){
//     return a + b + c;
//   }
//   public static void main(String args[]){
//     int a = 10;
//     int b = 30;
//     int c = 20;
//     int sum1 = sums( a,  b);
//     int sum2 = sums( a,  b, c);
//     System.out.println(sum1);
//     System.out.println(sum2);

//   }
// }

//


//checking if number is prime using methods.

// public class overloading{

//   public static boolean isPrime(int num){
//     boolean isPrime = true;
//     if(num ==2){
//       isPrime = true;
//     }
//     else{
//       for(int i =2; i < num; i++){
//         if(num % i ==0){
//           isPrime =  false;
//           break;
//         }
//       }
//     }
//       return isPrime;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();

//    boolean hel = isPrime(num);
//     System.out.println(hel);
//   }
// }



//printing all prime number in the given range

// public class overloading{
//   public static void main(String args[]){
//     int num = 10;

//     for(int i = 2; i < num; i++){
//       boolean isPrime = true;

//       for(int j = 2; j < i; j++){
//         if(i % j ==0){
//           isPrime = false;
//           break;
//         }
//       }
//       if(isPrime == true){
//         System.out.print(i + " ");
//       }
//     }

//   }
// }

//binary to decimal

// public class overloading{
//   public static void binToDec(int n){
//     int myNum = n;
//     int pow = 0;
//     int dec = 0;

//     while(n > 0){
//       int last = n % 10;
//       dec = dec + (last * (int)Math.pow(2, pow));
//       n = n / 10;
//       pow++;
//     }
//     System.out.print("decimal of " + myNum + " = " + dec);
//   }

//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     binToDec(n);
//   }
// }


//decimal to binary

// public class overloading{
//   public static void decToBin(int n){
//     int myNum = n;
//     int pow = 0;
//     int bin = 0;

//     while(n > 0){
//       int rem = n % 2;
//       bin = bin + (rem * (int)Math.pow(10, pow));
//       pow++;
//       n = n/2;
//     }
//       System.out.print("decimal of " + myNum + " = " + bin  );
    
    
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//     decToBin(n);
//   }
// }