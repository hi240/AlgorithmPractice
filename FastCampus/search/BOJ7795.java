package search;

import java.util.Arrays;
import java.util.Scanner;
//먹을 것인가 먹힐 것인가
public class BOJ7795 {
    public static int N;
    public static int[] a_arr;
    public static int[] b_arr;
    public static void main(String[] args) {
        input();
    }
    public static void sol(){
        Arrays.sort(b_arr,1,b_arr.length);
        int score=0;
        for(int i=0;i<a_arr.length;i++){
            score += binary(1,b_arr.length-1,a_arr[i]);
        }
        System.out.println(score);
    }
    public static int binary(int l,int r,int num){
        int result=l-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(b_arr[mid]<num){
                l=mid+1;
                result=mid;
            }else {
                r=mid-1;
            }
        }
        return result;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a_arr= new int[a];
            b_arr=new int[b+1];
            for(int j=0;j<a;j++){
                a_arr[j]=sc.nextInt();
            }
            for(int j=1;j<=b;j++){
                b_arr[j]=sc.nextInt();
            }
            sol();
        }
    }
}
