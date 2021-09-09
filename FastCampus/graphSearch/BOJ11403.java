package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//경로 찾기
public class BOJ11403 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static int[][] graph;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){

    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        //그래프
        graph = new int[N][N];
        String[] str =br.readLine().split(" ");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(str[j]);
            }
        }

    }
}
