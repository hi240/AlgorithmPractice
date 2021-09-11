package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20210911
//경로 찾기 (한방향그래프)
public class BOJ11403 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static ArrayList<Integer>[] list; //i랑 연결된 정점 리스트 보관
    public static int[][] answer; //정답을 저장할 그래프
    public static void main(String[] args) throws IOException {
        input();
        for(int i=0;i<N;i++){
            if(list[i].size()==0) continue; //i랑 연결된 점이 없으면 패스
            bfs(i);
        }
        for(int i=0;i<N;i++){ //정답 출력
            for(int j=0;j<N;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void bfs(int index){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[N]; //방문 체크
        q.add(index); //시작 정점 index랑 연결된 것 부터 돌거니까 가장 먼저 추가.
        while(!q.isEmpty()){
            int temp=q.poll();
            for(int i:list[temp]){ //temp 정점이랑 연결된 정점 다 돌기
                if(!visit[i]){
                    visit[i]=true; //방문처리
                    q.add(i);
                    answer[index][i]=1; //정답에 추가
                }
            }
        }
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        list = new ArrayList[N];
        answer=new int[N][N];
        for(int i=0;i<N;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<N;i++){
            String[] str = br.readLine().split(" ");
            for(int j=0;j<N;j++){
                if(Integer.parseInt(str[j])==1) list[i].add(j); //정점 i랑 연결된 점 다 추가
            }
        }
    }
}
