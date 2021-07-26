package backTracking;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon15650_2 {
    static int[] arr;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        arr = new int[m]; //2
        recursive(n,m,1,0);
    }
    static void recursive(int n,int m,int at,int depth) {
        if(m==depth) {
            for(int i=0;i<m;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=at;i<=n;i++) {
            arr[depth]=i; //arr[0]=1; arr[1]=2;
            recursive(n,m,at+1,depth+1); //recursive(1)? recursive(2)
        }
    }
}
