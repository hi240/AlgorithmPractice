package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//트리의 부모 찾기 (BFS)
public class BOJ11725_BFS {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list; //정점 관계성 저장
    public static int[] parent; //정점의 부모를 저장할 배열
    public static int N;
    public static void main(String[] args) throws IOException {
        input();
        bfs(1);
        for(int i=2;i<parent.length;i++){
            System.out.println(parent[i]); //두번째 노드부터 부모노드 출력
        }
    }
    public static void bfs(int n){ //부모노드 찾기
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[N+1];
        q.add(n);
        visit[n]=true;
        while(!q.isEmpty()){
            int mom=q.poll(); //자식노드가 부모노드가 될 차례
            for(int i:list[mom]){ //부모노드 mom의 자식노드 찾기
                if(visit[i]) continue; //이미 노드 i보다 위에 있는건 패스
                parent[i]=mom; //부모노드 데이터추가
                visit[i]=true; //방문처리
                q.add(i); //자식노드 추가
            }
        }
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        N=Integer.parseInt(st[0]);
        list = new ArrayList[N+1];
        parent = new int[N+1];
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