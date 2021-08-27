package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
//20210827
//DFS와 BFS
public class BOJ1260 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M,V;
    public static boolean[] visit;
    public static ArrayList<Integer>[] graph;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        input();
        dfs(V);
        sb.append("\n");
        for(int i=0;i<N+1;i++){
            visit[i]=false;
        }
        bfs(V);
        System.out.println(sb.toString());
    }
    public static void dfs(int x){
        visit[x]=true;
        sb.append(x).append(" ");
        for(int i:graph[x]){
            if(!visit[i])
            dfs(i);
        }
    }
    public static void bfs(int x){
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        while(!que.isEmpty()){
            int q=que.poll();
            if(visit[q]) continue;
            visit[q]=true;
            sb.append(q).append(' ');
            for(int i:graph[q]){
                if(!visit[i]){
                    que.add(i);
                }
            }
        }
    }
    public static void input() throws IOException {
        String[] st=br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        M=Integer.parseInt(st[1]);
        V=Integer.parseInt(st[2]);
        //정점 입력 받기
        //인접리스트 활용을 위해 배열형태 ArrayList 선언 및 초기화
        graph = new ArrayList[N+1];
        visit= new boolean[N+1]; //방문확인용 체크
        for(int i=1;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            String[] str=br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            graph[x].add(y);
            graph[y].add(x);
        }
        //오름차순 정렬
        for(int i=1;i<=N;i++){
            Collections.sort(graph[i]);
        }
    }
}
