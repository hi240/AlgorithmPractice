package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//20211014
//카드 구매하기
public class BOJ11052 {
    public static int[] arr;
    public static int n;
    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
    public static void pro(){
        int[] dp=new int[n+1];
        dp[1]=arr[1]; //카드 1의 가치는 항상 같음.
        for(int i=2;i<=n;i++){ //카드 2부터는
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[i-j]+arr[j]); //카드n 자체의 가치와 카드n-i의 최대가치+i의 가치를 비교해서 업데이트
            }
        }
        System.out.println(dp[n]);
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<n+1;i++){
            arr[i]=Integer.parseInt(st.nextToken()); //각 카드의 가치 입력받기
        }
    }
}
