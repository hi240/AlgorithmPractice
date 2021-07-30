package search;

import java.util.Arrays;
import java.util.Scanner;
//두 수의 합
public class BOJ3273 {
    public static int N,x;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<=N;i++){
            sum+=binary(1,N,x-arr[i]);
        }
        System.out.println(sum/2);
    }
    public static int binary(int l,int r,int num){
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==num) return 1;
            else if(arr[mid]<num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        x=sc.nextInt();
    }
}
