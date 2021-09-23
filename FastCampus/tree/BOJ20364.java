package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//부동산 다툼
public class BOJ20364 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,Q,num;
    public static ArrayList<Integer>[] list;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void sol(int n){
        num=0;
        dfs(1,1,n);
        System.out.println(num);
    }
    public static void dfs(int st,int mom,int n){ //점령값인지 구하기
       if(st==n) { 
           visit[st]=true;
           return;
       }
       for(int i:list[st]){
           if(i==mom) continue;
           dfs(i,st,n);
           if(i==n&&visit[n]){
               num=0;
               return;
           }
           if(visit[n]&&visit[i]) { 
               num=i;
               return;
           }
           if(visit[n]) break;
       }
    }
    public static void tree(int n){ //이진탐색트리 저장
        boolean chk=false;
        if(n*2<=N){
            list[n].add(n*2);
            list[n*2].add(n);
            chk=true;
        }
        if(n*2+1<=N){
            list[n].add(n*2+1);
            list[n*2+1].add(n);
            chk=true;
        }
        if(chk==true) tree(n+1);
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
       N=Integer.parseInt(st[0]);
        Q=Integer.parseInt(st[1]);
        visit=new boolean[N+1];
        list=new ArrayList[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList();
        }
        tree(1);
        for(int i=0;i<Q;i++){
           sol(Integer.parseInt(br.readLine()));
        }
    }
}
