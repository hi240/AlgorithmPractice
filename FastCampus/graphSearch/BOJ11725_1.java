package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//20210917
//트리의 부모 찾기 (BFS보다 성능이 떨어짐)
public class BOJ11725_1 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static boolean[] visit;
    public static ArrayList<Integer>[] list;
    public static int[] answer;
    public static void main(String[] args) throws IOException {
        input();
        sol(1);
        for(int i=2;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
    public static void sol(int i){ //부모노드 구하는 dfs
       visit[i]=true;
       for(int j:list[i]){
           if(!visit[j]){
               visit[j]=true;
               answer[j]=i;
               sol(j);
           }
       }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        visit=new boolean[N+1];
        answer=new int[N+1];
        list = new ArrayList[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<N-1;i++){
            String[] s = br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            list[x].add(y);
            list[y].add(x);
        }
    }
}
