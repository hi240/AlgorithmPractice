package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//20210912
//양
public class BOJ3184 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int R,C;
    public static int lamb,wolf;
    public static char[][] graph;
    public static boolean[][] visit;
    public static int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        input();
        sol();
        System.out.println(lamb+" "+wolf);
    }
    public static void sol(){
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(graph[i][j]=='#') continue; //울타리는 생략
                if(!visit[i][j]){ //방문한적이 없는 곳이면,
                    visit[i][j]=true; //방문처리
                    bfs(i,j); //연결된 해당 블럭 모두 순회
                }
            }
        }
    }
    public static void bfs(int i,int j){
        int _wolf=0;
        int _lamb=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        q.add(j);
        if(graph[i][j]=='v') _wolf++; //현재 위치의 늑대,양 처리
        else if(graph[i][j]=='o') _lamb++;
        while(!q.isEmpty()){
            int x = q.poll();
            int y = q.poll();
            for(int k=0;k<4;k++){ //현재위치로부터 4방향 순회
                int _x=x+dir[k][0];
                int _y=y+dir[k][1];
                if(check(_x,_y)) { //그래프 범위 안인지 체크
                    visit[_x][_y]=true; //방문처리
                    if(graph[_x][_y]=='#') continue; //울타리면 생략
                    else if(graph[_x][_y]=='v') _wolf++; //늑대누적
                    else if(graph[_x][_y]=='o') _lamb++; //양누적
                    q.add(_x);
                    q.add(_y);
                }
            }
        }
        if(_lamb>_wolf) lamb +=_lamb; //양이 더 많으면, 양 숫자만 누적
        else wolf +=_wolf; //아닐 경우 늑대 숫자만 누적
    }
    public static boolean check(int x,int y){ //유효성 검사
        if(x<0||y<0||x>=R||y>=C) return false; //영역 밖이면 불가
        if(visit[x][y]) return false; //방문한 곳이면 불가
        return true;
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        R=Integer.parseInt(st[0]);
        C=Integer.parseInt(st[1]);
        graph = new char[R][C];
        visit=new boolean[R][C];
        for(int i=0;i<R;i++){
            String str=br.readLine();
            for(int j=0;j<C;j++){
                graph[i][j]=str.charAt(j);
            }
        }
    }
}
