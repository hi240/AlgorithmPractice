package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//바이러스
public class BOJ2606 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M;
    public static boolean[] visit;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
        bfs(1);
    }
    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visit[i]=true;
        int cnt=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            for(int j:list[temp]){
                if(visit[j]) continue;
                visit[j]=true;
                q.add(j);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        M=Integer.parseInt(br.readLine());
        //정점
        list = new ArrayList[N+1];
        visit = new boolean[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            String[] s = br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            list[x].add(y);
            list[y].add(x);
        }
    }
}
