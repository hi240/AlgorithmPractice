package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20211019
//포도주 시식
public class BOJ2156 {
    public static int n;
    public static int[] grape;
    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        grape=new int[n+1];
        for(int i=1;i<=n;i++){
            grape[i]=Integer.parseInt(br.readLine()); //포도양 저장
        }
    }
    public static void pro() {
        int[] max=new int[n+1]; //각 경우에서 최대 포도의 양 저장
        max[1]=grape[1];
        if(n!=1){
            max[2]=grape[1]+grape[2]; //두번째 포도까지는 연속으로 마실 수 있다.
            for(int i=3;i<=n;i++){
                max[i]=Math.max(max[i-1],Math.max(grape[i]+max[i-2],grape[i]+grape[i-1]+max[i-3]));
            }
//1.본인제외하고 n-1까지 최대 양 2.본인포함하고,n-1은 제외하고,n-2까지 최대 양 3.본인포함,n-1포함,n-3까지 최대양을 비교
        }
        System.out.println(max[n]); //해당 n에서 최대양 출력
    }
}