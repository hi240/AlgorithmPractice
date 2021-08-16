package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){

    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        arr = new int[N+1];
        String[] str =br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
