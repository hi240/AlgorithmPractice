package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//수열
public class BOJ2559 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,K;
    public static int[] arr;
    public static int max;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        max=Integer.MIN_VALUE;
        int r=1;
        int sum=0;
        for(int l=1;l<=N-K+1;l++){
            while(r<l+K&&r<=N){
                sum+=arr[r];
                r++;
            }
            max=Math.max(max,sum);
            sum -= arr[l];
        }
        System.out.println(max);
    }
    public static void input() throws IOException {
        String[] nm=br.readLine().split(" ");
        N=Integer.parseInt(nm[0]);
        K=Integer.parseInt(nm[1]);
        arr = new int[N+1];
        String[] str =br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
