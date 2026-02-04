import java.util.Arrays;

public class arr1 {
  public static void main(String[] args){
    int[] arr1 = new int[20];
    int[] arr2 = {1,12,13,4,5,6,7,8,19,0,11,2,3,14,15,16,17,9,20,18};
    int len = arr2.length;
    System.out.println(len);
    for(int i =0; i <len; i++){
      // System.out.println(arr2[i]);
    }
    String s = "hello hyy";
    int length = s.length();
    System.out.println(length);
    int[] arr3 = new int[len];
    
    for(int i = 0; i < len;i++){
      arr3[i] = arr2[i];
    }
    for(int i = 0; i < len;i++){
      System.out.print(arr3[i] + " ");
    }
    Arrays.sort(arr3);
    System.out.println();
    for(int i = 0; i < len;i++){
      System.out.print(arr3[i] + " ");
    }
    
  }
}
