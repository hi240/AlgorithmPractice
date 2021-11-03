package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//스티커 https://www.acmicpc.net/problem/9465
public class BOJ9465 {
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test-->0){
            int n=Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n+1];
            for(int i=0;i<2;i++){
                String[] str=br.readLine().split(" ");
                for(int j=0;j<n;j++){
                    arr[i][j]=Integer.parseInt(str[j]);
                }
            }
           pro(arr);
        }
    }
    public static void pro(int[][] arr) {

    }
}
