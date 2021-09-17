package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//20210917
//탈출
public class BOJ3055 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M;
    public static char[][] graph; //원본맵
    public static int[][] water_graph; //시간당 물변화
    public static int[][] hedge_graph; //시간당 고슴도치위치
    public static int[][] arr = {{1,0},{0,1},{-1,0},{0,-1}};
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
        water();
    }
    public static void water(){ //water가 초지남에 따라 물이 퍼져있는지 저장하는 그래프 생성
        Queue<Integer> q = new LinkedList<>();
        water_graph = new int[N][M];
        int hedge_x=0,hedge_y=0;
        boolean[][] visit = new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(graph[i][j]=='*'){ //물이 있는 곳은 한번에 모두 queue에 넣어두기
                    visit[i][j]=true;
                    q.add(i);
                    q.add(j);
                }
                if(graph[i][j]=='S'){
                    hedge_x=i;hedge_y=j; //고슴도치 있는 곳 저장
                }
            }
        }
        while(!q.isEmpty()){ //초기맵에 있던 물길들 모두 동시에 시작.
            int x=q.poll();
            int y=q.poll();
            for(int i=0;i<4;i++){ //사방향탐색
                int _x=x+arr[i][0];
                int _y=y+arr[i][1];
                if(_x<0||_y<0||_x>=N||_y>=M) continue; //범위체크
                if(visit[_x][_y]||graph[_x][_y]!='.') continue; //방문했거나,바닥이 아닌 경우
                visit[_x][_y]=true;
                water_graph[_x][_y]=water_graph[x][y]+1; //이 전 칸의 시간에서 +1초
                q.add(_x);
                q.add(_y);
            }
        }
        hedge(hedge_x,hedge_y); //고슴도치 있는 곳 전달
    }
    public static void hedge(int hedge_x,int hedge_y){ //고슴도치 위치에서 시작~동굴까지
        Queue<Integer> q = new LinkedList<>();
        boolean[][] visit = new boolean[N][M];
        hedge_graph = new int[N][M]; //고슴도치 이동경로 저장 맵
        q.add(hedge_x); q.add(hedge_y);
        visit[hedge_x][hedge_y]=true;
        while(!q.isEmpty()){
            int x=q.poll();
            int y=q.poll();
            for(int i=0;i<4;i++){ //사방향탐색
                int _x=x+arr[i][0];
                int _y=y+arr[i][1];
                if(_x<0||_y<0||_x>=N||_y>=M) continue; //범위 벗어나면
                if(visit[_x][_y]) continue; //방문한 경우
                if(graph[_x][_y]=='*'||graph[_x][_y]=='X') continue; //장애물 만나면
                if(water_graph[_x][_y]<=hedge_graph[x][y]+1&&water_graph[_x][_y]!=0) continue; //중요!
                //고슴도치가 이동할 칸까지의 초가 해당 칸에 물길이 오는 초 보다 작으면 통과가 가능하다.
                //하지만 물길 시간을 표시한 그래프에서 동굴은 0초로 기록되어있기에 이 부분만 예외처리 해줘야한다.
                //만약 조건에 걸릴경우에는 이 칸에 대한 초를 업데이트 하지 않을 거기 때문에 우선적으로 +1초를 대입해서 확인한다.
                hedge_graph[_x][_y]=hedge_graph[x][y]+1; //위의 예외에 해당하지 않을 경우에만 이 칸의 초를 업데이트.
                if(graph[_x][_y]=='D'){ //동굴에 도착
                    System.out.println(hedge_graph[_x][_y]); //출력 후 종료
                    System.exit(0);
                }
                visit[_x][_y]=true;
                q.add(_x);
                q.add(_y);
            }
        }
        System.out.println("KAKTUS"); //bfs를 다 순회했으나 종료되지 않았다면 불가능 출력
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        M=Integer.parseInt(st[1]);
        graph = new char[N][M];
        for(int i=0;i<N;i++){
            String str =br.readLine();
            for(int j=0;j<M;j++){
                graph[i][j]=str.charAt(j);
            }
        }
    }
}
