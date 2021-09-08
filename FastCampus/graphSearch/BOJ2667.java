package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//20210828
//단지번호붙이기
public class BOJ2667 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static int[][] graph;
    public static boolean[][] visit;
    public static int[][] dir = {{1, 0},{0,1},{-1,0},{0,-1}};
    public static int depth;
    public static void main(String[] args) throws IOException {
        input();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++){ //모든 칸에 대해서 집이 있는 곳을 찾는다.
            for(int j=0;j<N;j++) {
                if(visit[i][j]) continue; //방문했던 곳은 제외
                if(graph[i][j]==0) continue; //집이 없는 곳은 제외
                depth=0;
                dfs(i,j); //집이 있는 곳부터 시작해서 단지의 끝까지.
                arr.add(depth); //단지의 집 수 누적
            }
        }
        Collections.sort(arr); //오름차순 정렬
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static void dfs(int x,int y){
        depth++; //집의 갯수 누적
        visit[x][y]=true; //방문처리
        for(int i=0;i<4;i++){ //4방향으로 더 갈 수 있는지 확인.
            int rx=x+dir[i][0];
            int ry=y+dir[i][1];
            if(rx<0||ry<0||rx>=N||ry>=N) continue; //공간제한 넘으면 패스.
            if(visit[rx][ry]) continue; //방문했던 곳이면 패스.
            if(graph[rx][ry]==0) continue; //집이 없는 곳 패스.
            dfs(rx,ry); //모두 해당 안된다면, 해당 방향의 집 방문.
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
