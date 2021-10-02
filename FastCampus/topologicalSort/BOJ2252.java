package topologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//20211002
//줄 세우기 위상정렬
public class BOJ2252 {
    public static ArrayList<Integer>[] list;
    public static int[] indeg;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        input();
        sol();
        System.out.println(sb.toString());
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        indeg= new int[N+1];
        list = new ArrayList[N+1];
        for(int i=0;i< list.length;i++){
            list[i]= new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            list[a].add(b);
            indeg[b]++;
        }
    }
    public static void sol(){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<indeg.length;i++){
            if(indeg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int x = q.poll();
            for(int y:list[x]){
                indeg[y]--;
                if(indeg[y]==0) q.add(y);
            }
            sb.append(x).append(' ');
        }
    }
}
