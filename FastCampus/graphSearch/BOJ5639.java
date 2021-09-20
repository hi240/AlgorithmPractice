package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//이진 검색 트리
public class BOJ5639 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M;
    public static int[] graph;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){

    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        M=Integer.parseInt(st[1]);

        //그래프
        graph = new int[N+1];
        String[] str =br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            graph[i]=Integer.parseInt(str[i-1]);
        }

        //정점
        list = new ArrayList[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            String[] s = br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
        }
    }
}
