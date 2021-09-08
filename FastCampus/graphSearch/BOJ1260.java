package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//DFS와 BFS
public class BOJ1260 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M,V;
    public static int[] arr;
    public static ArrayList<Integer>[] graph;
    public static boolean[] visit;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        input();
        dfs(V);
        System.out.println(sb.toString());
    }
    public static void dfs(int idx){
        visit[idx]=true;
        sb.append(idx).append(' ');
        for(int x:graph[idx]){
            if(!visit[x])
                dfs(x);
        }
    }
    public static void input() throws IOException {
        String[] sr=br.readLine().split(" ");
        N=Integer.parseInt(sr[0]);
        M=Integer.parseInt(sr[0]);
        V=Integer.parseInt(sr[0]);
        visit = new boolean[M+1];
        graph = new ArrayList[N+1];
        for(int i=1;i<=M;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=1;i<=M;i++){
            String[] st= br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            graph[x].add(y);
            graph[y].add(x);
        }
        for(int i=1;i<=M;i++){
            Collections.sort(graph[i]);
        }
    }
}
