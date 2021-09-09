package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//연결 요소의 개수
public class BOJ11724 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M;
    public static ArrayList<Integer>[] list;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        int cnt=0; //연결 요소의 개수 카운트
        for(int i=1;i<=N;i++){
            if(visit[i]) continue;
            bfs(i); //간점 i 부터 시작해, 연결된 정점 다 돌기
            cnt++;
        }
        System.out.println(cnt);
    }
    public static void bfs(int i){
        visit[i]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int j:list[temp]){
                if(visit[j]) continue;
                visit[j]=true;
                q.add(j);
            }
        }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]); //정점
        M=Integer.parseInt(st[1]); //간선
        list = new ArrayList[N+1]; //정점 관계확인용 list배열
        visit = new boolean[N+1]; //방문확인
        for(int i=0;i<list.length;i++){ //배열이기 때문에 .size()가 아닌 .list()임
            list[i]= new ArrayList<Integer>(); //ArrayList형태의 배열 초기화
        }
        for(int i=0;i<M;i++){
            String[] s = br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            list[x].add(y); //각 정점의 관계성 주입
            list[y].add(x);
        }
    }
}
