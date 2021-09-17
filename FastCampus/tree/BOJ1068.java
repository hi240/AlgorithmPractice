package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//트리
//트리에서 ArrayList에 정점관계를 저장할때, 정점의 부모를 저장할건지, 자식을 저장할건지 먼저 정하고 시작하자 반드시.
public class BOJ1068 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,DEL;
    public static ArrayList<Integer>[] list;
    public static int[] score;
    public static void main(String[] args) throws IOException {
        input();
        sol();
        System.out.println(score[0]);
    }
    public static void sol(){ //일단 해당 노드를 제거하고, 그 담에 단말노드세자.

    }
    //    0
    //  1   2
    // 3 4   5
    public static void dfs(){

    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        list = new ArrayList[N];
        for(int i=0;i<N;i++) list[i]= new ArrayList<Integer>();
        String[] str =br.readLine().split(" ");

        DEL=Integer.parseInt(br.readLine());
    }
}
