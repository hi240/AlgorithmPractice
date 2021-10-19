package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20211020
//이친수
public class BOJ2193 {
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        pro(n);
    }
    public static void pro(int n){
        long[] arr = new long[n+1];
        arr[1]=1;
        if(n>1){
            arr[2]=1;
        }
        for(int i=3;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
