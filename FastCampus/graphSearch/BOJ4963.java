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
        int cnt=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(graph[i][j]==1&&!visit[i][j]){
                    visit[i][j]=true;
                    q.add(i);
                    q.add(j);
                    bfs();
                    cnt++;
                }
            }
        }
        for(int i=0;i<h;i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(visit[i][j]);
            }
            System.out.println();
        }
        System.out.println(cnt);
    }
    public static void bfs(){
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        while(!q.isEmpty()){
            int x=q.poll();
            int y=q.poll();
            for(int i=0;i<8;i++){
                int _x=x+dir[i][0];
                int _y=y+dir[i][1];
                if(_x<0||_y<0||_x>=h||_y>=w) continue;
                if(visit[_x][_y]) continue;
                visit[_x][_y]=true;
                q.add(_x);
                q.add(_y);
            }
        }
    }
    public static void input() throws IOException {
        while(true){
            String[] st = br.readLine().split(" ");
            w=Integer.parseInt(st[0]);
            h=Integer.parseInt(st[1]);
            if(w==0&&h==0) break;
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
