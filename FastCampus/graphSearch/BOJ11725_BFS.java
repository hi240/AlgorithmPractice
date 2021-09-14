package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//트리의 부모 찾기 (BFS)
//아예 배열에 모든 수의 부모를 저장해놓는 배열을 만들고, 그 배열을 출력하는 아이디어.
//내가 bfs에서 막힌거는, 한 숫자를 마주할 때 마다 bfs를 타서 인접한 점을 타고 1을 만날때까지 이동후, 1을 만나는 점중에
//젤 가까운 애를 출력하느라고 오래 걸릴 수밖에..
public class BOJ11725_BFS {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static ArrayList<Integer>[] list; //정점 관계성 저장
    public static int[] parent; //정점의 부모를 저장할 배열
    public static void main(String[] args) throws IOException {
        input();
        bfs(1);
        for(int i=2;i<parent.length;i++){
            System.out.println(parent[i]);
        }
    }
    public static void bfs(int n){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[N+1];
        q.add(n);
        visit[n]=true;
        while(!q.isEmpty()){
            int mom=q.poll();
            for(int i:list[mom]){
                if(visit[i]) continue;
                parent[i]=mom;
                visit[i]=true;
                q.add(i);
            }
        }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        list = new ArrayList[N+1];
        parent = new int[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<>();
        }
        for(int i=1;i<N;i++){
            String[] s = br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            list[x].add(y);
            list[y].add(x);
        }
    }
}