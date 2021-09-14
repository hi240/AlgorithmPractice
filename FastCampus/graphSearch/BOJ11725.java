package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//트리의 부모 찾기 (DFS)
public class BOJ11725 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static ArrayList<Integer>[] list;
    public static boolean[] visit;
    public static boolean check;
    public static void main(String[] args) throws IOException {
        input();
        for(int i=2;i<=N;i++){
            visit = new boolean[N+1];
            visit[i]=true;
            dfs(i,0,0);
            check=false;
        }
    }
    public static void dfs(int n, int depth,int mom){
        if(n==1){
            System.out.println(mom);
            check =true;
            return;
        }
        for(int i:list[n]){
            if(!visit[i]){
                visit[i]=true;
                System.out.println(i+" i");
                if(depth==0) mom=i;
                dfs(i,depth+1,mom);
                if(check) break;
            }
        }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        list = new ArrayList[N+1];
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