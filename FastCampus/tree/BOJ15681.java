package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//20210927
//트리와 쿼리
public class BOJ15681 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,R,Q;
    public static ArrayList<Integer>[] list; //노드 관계성
    public static int[] cnt; //자식노드의 갯수 저장
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        R=Integer.parseInt(st[1]);
        Q=Integer.parseInt(st[2]);
        cnt=new int[N+1];
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
        sol(); //트리생성
        for(int i=0;i<Q;i++){
            int a = Integer.parseInt(br.readLine());
            System.out.println(cnt[a]); //입력받은 노드의 자식노드 반환
        }
    }
    public static void sol(){
        tree(R,0); //루트노드 기준으로 트리생성
    }
    public static void tree(int r,int prev){
        for(int i:list[r]){
            if(i==prev) continue;
            tree(i,r);
            cnt[r]+=cnt[i]; //자식노드의 갯수 누적
        }
        cnt[r]++; //자기자신도 자식노드에 포함
    }
}









