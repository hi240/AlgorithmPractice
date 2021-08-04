package search;

import java.util.Arrays;
import java.util.Scanner;

//예산
public class BOJ2512 {
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
    public static int binary(int l,int r){
        int res=0;
        while(l<=r){
            int sum=0;
            int mid=(l+r)/2;
            for(int i=0;i<arr.length;i++){
                if(mid>arr[i]){
                    sum+=arr[i];
                }else{
                    sum+=mid;
                }
            }
            if(sum<=M){
                if(mid<=M) res=mid;
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
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        M=sc.nextInt();
    }
}
