package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//단지번호붙이기
public class BOJ2667 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static int[][] graph;
    public static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        input();
        dfs(0,0);
    }
    public static void dfs(int x,int y){
        visit[x][y]=true;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
                if(visit[)
                if(graph[i][j]==0) continue;

            }
        }
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visit = new boolean[N][N];
        for(int i=0;i<N;i++){
            String[] str = br.readLine().split("");
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(str[j]);
            }
        }
    }
}
