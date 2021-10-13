package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20211013
//1,2,3 더하기 3
public class BOJ15988 {
    public static long[] save;
    public static void sol() {
        save= new long[1000001];
        save[1]=1; //초기값 설정
        save[2]=2;
        save[3]=4;
        for(int i=4;i<1000001;i++){ //점화식에 맞게 값 누적
            save[i]=(save[i-1]+save[i-2]+save[i-3])%1000000009;
        }
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        while(testcase-->0){
            int num=Integer.parseInt(br.readLine());
            System.out.println(save[num]);
        }
    }
    public static void main(String[] args) throws IOException {
        sol();
        input();
    }
}
