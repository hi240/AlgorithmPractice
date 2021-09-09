package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20210909
//섬의 개수
public class BOJ4963 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int w,h;
    public static int[][] graph;
    public static boolean[][] visit;
    public static Queue<Integer> q = new LinkedList<>();
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void sol(){
        visit = new boolean[h][w];
        int cnt=0; //땅갯수
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(graph[i][j]==1&&!visit[i][j]){ //땅이고, 방문한적없으면
                    visit[i][j]=true; //방문체크
                    q.add(i);
                    q.add(j);
                    bfs(); //발견한 땅부터 시작해서 이어진 땅 다 돌기
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(){
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}}; //4방향+대각선까지
        while(!q.isEmpty()){
            int x=q.poll();
            int y=q.poll();
            for(int i=0;i<8;i++){ //4방향+대각선 돌기
                int _x=x+dir[i][0];
                int _y=y+dir[i][1];
                if(_x<0||_y<0||_x>=h||_y>=w) continue; //그래프 넘으면 패스
                if(visit[_x][_y]) continue; //방문했으면 패스
                if(graph[_x][_y]==1){ //땅이면,
                    visit[_x][_y]=true; //방문체크
                    q.add(_x);
                    q.add(_y);
                }
            }
        }
    }
    public static void input() throws IOException {
        while(true){
            String[] st = br.readLine().split(" ");
            w=Integer.parseInt(st[0]);
            h=Integer.parseInt(st[1]);
            if(w==0&&h==0) break; // 0 0 입력받으면 프로그램 종료
            graph = new int[h][w];
            for(int i=0;i<h;i++){
                String[] str =br.readLine().split(" ");
                for(int j=0;j<str.length;j++){
                    graph[i][j]=Integer.parseInt(str[j]);
                }
            }
            sol();
        }

    }
}
