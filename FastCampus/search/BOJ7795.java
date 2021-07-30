package search;

import java.util.Arrays;
import java.util.Scanner;
//먹을 것인가 먹힐 것인가
public class BOJ7795 {
    public static int[] a,b;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(b,1,b.length);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum +=binary(1,b.length,a[i]);
        }
        System.out.println(sum);
    }
    public static int binary(int left,int right,int num){
        int res=left;
        while(left<=right){
            int mid=(left+right)/2;
            if(b[mid]<num){
                left=mid+1;
                res=mid;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            a = new int[n];
            b = new int[m+1];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            for(int j=1;j<=m;j++){
                b[j]=sc.nextInt();
            }
            sol();
        }
    }
}
