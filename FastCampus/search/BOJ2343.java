package search;

import java.util.Scanner;
//기타 레슨
public class BOJ2343 {
    public static int N,M;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        binary(max,10000);
    }
    public static void binary(int l,int r){
        while(l<=r){
            int sum=0;
            int mid=(l+r)/2; //블루레이 크기 후보
            for(int i=0;i<arr.length;i++){
                sum +=arr[i];
                if(sum>mid){

                }
            }

        }
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
