package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//트리와 쿼리
public class BOJ15681 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,R,Q;
    public static ArrayList<Integer>[] list; //자식 노드 저장
    public static int[] haha;
    public static int temp;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        R=Integer.parseInt(st[1]);
        Q=Integer.parseInt(st[2]);

        haha=new int[N+1];
        list=new ArrayList[N+1];
        for(int i=0;i<list.length;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<N-1;i++){ //각 노드 관계성 저장
            String[] str = br.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
            list[x].add(y);
            list[y].add(x);
        }
        sol();
//        for(int i=0;i<Q;i++){
//            String[] str = br.readLine().split(" ");
//            Integer.parseInt(str[0]);
//        }
    }
    public static void sol(){
        tree(R,0);
        System.out.println(Arrays.toString(haha));
    }
    public static void tree(int r,int prev){
        boolean chk=false;
        for(int i:list[r]){
            if(i==prev) continue;
            chk=true;
            tree(i,r);
            haha[r] +=haha[i];
        }
        if(!chk) haha[r]++;
        //자식노드없어서 위에포문못탈경우 처리필요>haha[그수]++;
    }
}
