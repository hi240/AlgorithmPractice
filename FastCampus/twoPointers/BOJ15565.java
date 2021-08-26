package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2021-08-26
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
        int r=0;
        int sum=0;
        for(int l=1;l<=N-K+1;l++){
            if(arr[l]!=1) continue; //l포인터는 1을 마주칠 때 고정한다.
            while(sum<K && r<N){  //K만큼 1을 마주칠 때까지 r포인터를 늘린다.
                r++;
                if(arr[r]==1) sum++; //1을 마주쳤을 때,sum을 누적시킨다.
            }
            if(sum==K) {
                min=Math.min(min,r-l+1);
                sum--; //이번 l포인터의 1은 다시 오지 않을 것이므로, 뺀다.
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
