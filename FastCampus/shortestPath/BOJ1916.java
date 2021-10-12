package shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//20211012
//최소비용 구하기(가중치그래프)
public class BOJ1916 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Info>[] list;
    public static int[] dist;
    public static int n;
    static class Info{
        int idx; int dist;
        Info(int _idx,int _dist){
            this.idx=_idx;
            this.dist=_dist;
        }
    }
    public static void input() throws IOException {
        n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        dist=new int[n+1];
        list = new ArrayList[n+1]; //연결된 간선끼리의 관계성,가중치 저장
        for(int i=0;i<list.length;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());
            int dis=Integer.parseInt(st.nextToken());
            list[from].add(new Info(to,dis));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start=Integer.parseInt(st.nextToken());
        int end=Integer.parseInt(st.nextToken());
        dijkstra(start,end);
    }
    public static void dijkstra(int start,int end){
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0; //시작점 본인까지의 거리는 0
        PriorityQueue<Info> pq= new PriorityQueue<>(Comparator.comparingInt(o->o.dist)); //입력순서와 상관없이, 제일 빠르게 도착한 다음 정점이 queue의 맨 앞으로 온다.
        pq.add(new Info(start,0)); //Start부터 시작
        while(!pq.isEmpty()){
            Info info=pq.poll();
            if(dist[info.idx]!=info.dist){ //PriorityQueue이기 때문에 가능하다.
                continue; //정점까지 거리가 변경되어있다는 것은, 이미 다른 정점을 통해 이 정점에 더 빠르게 왔던 거리로 갱신되어있다는 뜻이다.
            }
            for(Info e:list[info.idx]){
                if(dist[info.idx]+e.dist<dist[e.idx]){ //현재정점까지거리+새정점까지거리 < 기존새정점까지 거리 이면,
                    dist[e.idx]=dist[info.idx]+e.dist; //새 정점까지의 거리를 이걸로 업데이트 해준다.
                    pq.add(new Info(e.idx,dist[e.idx]));
                }
            }
        }
        System.out.println(dist[end]); //목표 정점까지의 거리 출력
    }
    public static void main(String[] args) throws IOException {
        input();
    }
}
