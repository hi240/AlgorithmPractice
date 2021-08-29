package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20210829
//연구소
public class BOJ14502 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M,max;
    public static int[][] graph;
    public static boolean[][] visit;
    public static int[][] loc= {{1,0},{0,1},{-1,0},{0,-1}};
    public static ArrayList<Integer> list= new ArrayList<>();
    public static void main(String[] args) throws IOException {
        input();
        bfs();
        //중간점검
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
        System.out.println("**************************");
    }
    public static void bfs(){
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<list.size()/2;i+=2){
            que.add(list.get(i));
            que.add(list.get(i+1));
        }
        while(!que.isEmpty()){
            int x= que.poll();
            int y= que.poll();
            visit[x][y]=true;
            for(int i=0;i<4;i++){
                int lx= x+loc[i][0];
                int ly= y+loc[i][1];
                if(lx<0||ly<0||lx>=N||ly>=M) continue; //범위 넘으면 제외
                if(visit[lx][ly]) continue; //이미 방문한 곳 제외
                if(graph[lx][ly]==1) continue; //벽이면 제외
                visit[lx][ly]=true; //방문체크
                graph[lx][ly]=2; //바이러스 추가
                que.add(lx);
                que.add(ly); //que에 좌표 추가
            }
        }

    }
    public static void input() throws IOException {
        String[] str=br.readLine().split(" ");
        N=Integer.parseInt(str[0]);
        M=Integer.parseInt(str[0]);
        graph=new int[N][M];
        visit=new boolean[N][M];
        for(int i=0;i<N;i++){
            String[] st=br.readLine().split(" ");
            for(int j=0;j<M;j++){
                graph[i][j]=Integer.parseInt(st[j]);
                if(graph[i][j]==2) { //바이러스 좌표는 바로 list에 추가
                    list.add(i);
                    list.add(j);
                }
            }
        }
    }
}
