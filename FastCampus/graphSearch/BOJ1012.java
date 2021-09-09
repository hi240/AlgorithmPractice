package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//유기농 배추 (덩어리 세는 문제)
public class BOJ1012 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int T; //테스트케이스 갯수
    public static int M,N,K; //배추밭정보
    public static int[][] graph; //배추그래프
    public static Queue<Integer> q = new LinkedList<>();
    public static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] st = br.readLine().split(" ");
            M=Integer.parseInt(st[0]); //가로
            N=Integer.parseInt(st[1]); //세로
            K=Integer.parseInt(st[2]);
            graph=new int[M][N];
            visit = new boolean[M][N];
            for(int j=0;j<K;j++){
                String[] s=br.readLine().split(" ");
                graph[Integer.parseInt(s[0])][Integer.parseInt(s[1])]=1; //배추자리표시
            }
            System.out.println(sol());
        }
    }
    public static int sol(){
        int cnt=0;
        for(int i=0;i<M;i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == 1&&!visit[i][j]) {
                    visit[i][j]=true; //방문표시
                    q.add(i);
                    q.add(j);
                    bfs(); //이어진 배추 모두 다 순회
                    cnt++; //배추 덩어리 카운트
                }
            }
        }
        return cnt;
    }
    public static void bfs(){
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int x=q.poll();
            int y=q.poll();
            //visit[x][y]=true; 이 자리에서 방문처리는 좋지 않다. =>메모리 초과
            for(int i=0;i<4;i++){ //사방면 확인하면서 범위 늘려나가기
                int _x=x+dir[i][0];
                int _y=y+dir[i][1];
                if(_x<0||_y<0||_x>=M||_y>=N) continue;
                if(visit[_x][_y]) continue;
                if(graph[_x][_y]==1){
                    q.add(_x);
                    q.add(_y);
                    visit[_x][_y]=true;
                }
            }
        }
    }
}
