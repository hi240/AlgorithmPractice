package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20211018
//계단 오르기
public class BOJ2579 {
    static int[] arr;
    static int[] ans;
    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arr=new int[N+1]; //계단의 가치 저장
        ans=new int[N+1]; //각 계단에서의 최대값 저장
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    public static void pro(){
        int[][] best=new int[arr.length][2];
        best[1][0]=arr[1];
        best[1][1]=arr[1];
        ans[1]=arr[1];
        for(int i=2;i<best.length;i++){
            best[i][0]=best[i-1][1]+arr[i]; //직전칸을 밟았을경우
            best[i][1]=Math.max(best[i-2][0],best[i-2][1])+arr[i]; //직전칸을 안밟았을 경우에는 2칸전이어도, 한칸전이어도 상관없다.
            ans[i]=Math.max(best[i][0],best[i][1]);
        }
        System.out.println(ans[ans.length-1]);
    }
}
