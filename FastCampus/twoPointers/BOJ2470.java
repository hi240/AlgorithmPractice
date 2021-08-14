package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//두 용액
public class BOJ2470 {
    public static int N;
    public static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr,1,N+1);
        int r=N,l=1;
        int min_l=0, min_r=0;
        int min=Integer.MAX_VALUE;
        while(l<r){
            int sum=arr[r]+arr[l];
            if(Math.abs(sum)==0) {
                min_l=arr[l];
                min_r=arr[r];
                break;
            }
            if(min>Math.abs(sum)){
                min_l=arr[l];
                min_r=arr[r];
                min=Math.abs(sum);
            }
            if(sum<0) l++;
            else r--;
        }
        sb.append(min_l).append(" ").append(min_r);
        System.out.println(sb.toString());
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr = new int[N+1];
        String[] str = br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
