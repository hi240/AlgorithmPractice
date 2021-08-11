package twoPointers;

import java.util.Scanner;

public class BOJ1806 {
    public static int N,S;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        int l=0;
        int r=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(l>r){
            r++;
            for(int i=l;i<r;i++){
                sum += arr[i];
            }
            if(sum>=S){
                min=Math.min(min,r-l+1);
                l++;
            }
        }
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        S=sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
