package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//연구소
public class BOJ14502_test{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M,max;
    public static int[][] graph;
    public static boolean[][] visit;
    public static int result=0;
    public static int[][] loc= {{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        input();
        dfs(0);
        System.out.println(result);
    }
    public static void dfs(int depth){
        if(depth==3){ //벽을 최대 3개 세울 수 있다
            int[][] fresh=new int[N][M];
            for(int i=0;i<N;i++) {
                for(int j=0;j<M;j++){
                    fresh[i][j]=graph[i][j];
                }
            }
            bfs(fresh); //벽 세우면, 바이러스 분포에 들어감.
            return;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(graph[i][j]==0){ //벽이 아니라면
                    graph[i][j]=1; //벽을 세우고,
                    dfs(depth+1); //다음 벽을 세우러 재귀
                    graph[i][j]=0; //dfs 다돌면 다른 경우의 수를 위해 초기화
                }
            }
        }
    }
    public static void bfs(int[][] copy){
        visit=new boolean[N][M]; //4방면 돌 때 바이러스 원산지 중복 확인용
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++){
                if(copy[i][j]==2){
                    q.add(i);
                    q.add(j);
                }
            }
        }
        while(!q.isEmpty()){
            int x=q.poll(); //바이러스 있는 곳 부터 시작
            int y=q.poll();
            visit[x][y]=true; //방문처리
            for(int i=0;i<4;i++){ //바이러스 기준으로 사방면 확인
                int _x=x+loc[i][0];
                int _y=y+loc[i][1];
                if(_x<0||_y<0||_x>=N||_y>=M) continue; //그래프 범위 넘으면 패스
                if(visit[_x][_y]) continue; //이미 방문했을 시 패스
                if(copy[_x][_y]==0){ //바닥일 경우,
                    copy[_x][_y]=2; //바이러스 퍼뜨리기
                    q.add(_x); //q에 넣기
                    q.add(_y);
                }
            }
        }
        int cnt=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(copy[i][j]==0) cnt++; //안전한 곳 갯수 카운트
            }
        }
        result=Math.max(cnt,result); //결과 갱신
        if(result==14){
                        for(int i=0;i<N;i++) {
                for(int j=0;j<M;j++){
                    System.out.print(copy[i][j]);
                }
                System.out.println();
            }
        }
    }
    public static void input() throws IOException {
        String[] str=br.readLine().split(" ");
        N=Integer.parseInt(str[0]);
        M=Integer.parseInt(str[1]);
        graph=new int[N][M];
        for(int i=0;i<N;i++){
            String[] st=br.readLine().split(" ");
            for(int j=0;j<M;j++){
                graph[i][j]=Integer.parseInt(st[j]);
            }
        }
    }
}