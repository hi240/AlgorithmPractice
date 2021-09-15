package SH;

import java.io.IOException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      int sum=0;
      for(int i=0;i<arr.length;i++){
          int temp=sc.nextInt();
          sum += Math.pow(temp,2);
      }
        System.out.println(sum%10);
    }
}
