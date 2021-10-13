package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20211013
//피보나치 함수
public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] save= new int[41][2];
        save[0][0]=1;
        save[1][1]=1;
        for(int i=2;i<41;i++){
            save[i][0]=save[i-1][0]+save[i-2][0];
            save[i][1]=save[i-1][1]+save[i-2][1];
        }
        int testcase = Integer.parseInt(br.readLine());
        for(int i=0;i<testcase;i++){
            int temp=Integer.parseInt(br.readLine());
            System.out.println(save[temp][0]+" "+save[temp][1]);
        }
    }
}
