package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//수들의 합2
public class BOJ2003 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M,sum;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        int cnt=0;
        int r=1;
        for(int l=1;l<=N;l++){
            while(sum<M && r<=N){
                sum +=arr[r++];
            }
            if(sum==M) cnt++;
            sum -= arr[l];
        }
        System.out.println(cnt);
    }

    public static void input() throws IOException {
        String[] nm = br.readLine().split(" ");
        N=Integer.parseInt(nm[0]);
        M=Integer.parseInt(nm[1]);
        arr = new int[N+1];
        String[] str =br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
