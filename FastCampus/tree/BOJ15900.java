package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//20210922
//나무 탈출
public class BOJ15900 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int sum;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
        dfs(1,1,0);
        if(sum%2==0) System.out.println("No"); //이동횟수가 짝수이면 지고
        else System.out.println("Yes"); //홀수면 이긴다.
    }
    public static void dfs(int n,int mom,int depth){ //depth를 통해 총 이동길이 파악 가능
        if(n!=1&&list[n].size()==1) sum +=depth; //리프노드이면 이동길이 누적
        for(int i:list[n]){
            if(i==mom) continue;
            dfs(i,n,depth+1);
        }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        int N=Integer.parseInt(st[0]);
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
