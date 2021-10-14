package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20211013
//1,2,3 더하기 6
//n을 1,2,3의 덧셈으로 만들되, 연산이 과정이 대칭이어야함
public class BOJ15991 {
    public static long[] dp;
    public static void sol() {
        dp=new long[100001];
        dp[1]=1;
        dp[2]=2;
        dp[3]=2;
        dp[4]=3;
        dp[5]=3;
        dp[6]=6;
        for(int i=7;i<100001;i++){
            dp[i]=(dp[i-2]+dp[i-4]+dp[i-6])%1000000009;
        }
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        while(testcase-->0){
            int num=Integer.parseInt(br.readLine());
            System.out.println(dp[num]);
        }
    }
    public static void main(String[] args) throws IOException {
        sol();
        input();
    }
}
