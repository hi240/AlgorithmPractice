package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20211013
//1,2,3 더하기 6
//n을 1,2,3의 덧셈으로 만들되, 연산이 과정이 대칭이어야함
public class BOJ15991 {
    public static int[] dp;
    public static void sol() {
        dp=new int[1000001];

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
