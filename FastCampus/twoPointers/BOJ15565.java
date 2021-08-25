package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//귀여운 라이언
public class BOJ15565 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,K;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        //길이는 r-l+1이 되고, l과 r은 다음 1을 찾아 나설 때까지 진행한다.
        int min=Integer.MAX_VALUE;
        int r=1;
        for(int l=1;l<=N-K+1;l++){
            if(arr[l]!=1) continue;
            r=l;
            int sum=0;
            while(sum<K && r<=N){
                if(arr[r]==1) sum++;
                r++;
            }
            if(sum==K) {
                min=Math.min(min,r-l);
            }
        }
        if(min==Integer.MAX_VALUE) System.out.println("-1");
        else System.out.println(min);
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
