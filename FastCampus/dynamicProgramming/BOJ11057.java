package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//20211018
//오르막 수
public class BOJ11057 {
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        pro(n);
    }
    public static void pro(int n){
        int[][] sum= new int[n+1][10]; //[n자리수 일때][x로 끝나는 수의 개수]
        for(int i=0;i<10;i++){
            sum[1][i]=1; //초기값
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<j+1;k++){
                    sum[i][j] += sum[i-1][k];
                    sum[i][j] %=10007; //모듈러연산-수가 크기 때문에 자주 나눠줘야 함
                }
            }
        }
        int answer=0;
        for(int i=0;i<=9;i++){
            answer+=sum[n][i]; //n자리수 일때 i로 끝나는 수의 개수를 총합
            answer %=10007; 
        }
        System.out.println(answer);
    }
}
