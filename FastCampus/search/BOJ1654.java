package search;

import java.util.Arrays;
import java.util.Scanner;
//랜선 자르기
public class BOJ1654 {
    public static int N,M;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr);
        System.out.println(binary(1,arr[arr.length-1]));

    }
    public static long binary(long l,long r){
        long res=0;
        while(l<=r){
            long mid=(l+r)/2;
            long sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i]/mid;
            }
            if(sum>=M){
                res=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N];
        M=sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
