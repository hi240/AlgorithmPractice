package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20211013
//1,2,3 더하기 6
//n을 1,2,3의 덧셈으로 만들되, 연산이 과정이 대칭이어야함
public class BOJ15991 {
    public static int[][] save;
    public static int[] dp;
    public static void sol() {
        save= new int[1000001][2];
        dp=new int[1000001];
        save[1][0]=0;
        save[1][1]=1;
        save[2][0]=1;
        save[2][1]=1;
        save[3][0]=0;
        save[3][1]=2;
        dp[1]=1%1000000009;
        dp[2]=2%1000000009;
        dp[3]=2%1000000009;
        for(int i=4;i<1000001;i++){
            if(i%2==0){ //짝수일경우
                save[i][0] = save[i-1][1]+(save[i-2][1]*2)+save[i-3][1]; //이걸고쳐야됨
                //save[i][0] = save[i-2][0]+save[i-2][1]; //이걸고쳐야됨
                save[i][1] = save[i-2][0];//홀수개만큼더할때
                dp[i]=(save[i][0]+save[i][1]+1);
               // dp[i]=(save[i][0]+save[i][1])%1000000009;
            }else{ //홀수일경우
                save[i][1]=save[i-1][0]+save[i-3][0];//홀수개만큼더하기만함
                dp[i]=save[i][1]+1;
               // dp[i]=save[i][1]%1000000009;
            }
        }
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        while(testcase-->0){
            int num=Integer.parseInt(br.readLine());
            System.out.println(dp[num]+" 짝수:"+save[num][0]+" 홀수:"+save[num][1]);
            //System.out.println(dp[num]%1000000009);
        }
    }
    public static void main(String[] args) throws IOException {
        sol();
        input();
    }
}
