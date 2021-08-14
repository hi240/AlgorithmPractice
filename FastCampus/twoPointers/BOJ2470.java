package twoPointers;

import java.util.Arrays;
import java.util.Scanner;

//두 용액
public class BOJ2470 {
    public static int N;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr,1,N+1);
        int r=N;
        int min_l=0;
        int min_r=0;
        int min=Integer.MAX_VALUE;

        for(int l=1;l<=N;l++){
            while(l<r) {
                int temp = Math.abs(arr[l] + arr[r]);
                min = Math.min(min, temp);
                if (min == temp) {
                    min_l = arr[l];
                    min_r = arr[r];
                    if (temp == 0) break;
                }
                if (arr[l] + arr[r] < 0) {
                    break;
                } else if (arr[l] + arr[r] > 0) {
                    r--;
                    continue;
                }
            }
            if(l>r||r<1) break;
        }
        System.out.println(min_l+" "+min_r);
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
