package shortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//20211012
//최단경로
public class BOJ1753 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int V,E;
    public static ArrayList<Info>[] list;
    static class Info{
        int idx; int cost;
        Info(int _idx,int _cost){
            this.idx=_idx;
            this.cost=_cost;
        }
    }
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        V=Integer.parseInt(st.nextToken());
        E=Integer.parseInt(st.nextToken());
        list=new ArrayList[V+1];
        for(int i=1;i<V+1;i++){
            list[i]=new ArrayList<Info>();
        }
        st = new StringTokenizer(br.readLine());
        int start=Integer.parseInt(st.nextToken());
        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            list[u].add(new Info(v,w)); //각 정점 관계성 저장
        }
        dijkstra(start);
    }
    public static void dijkstra(int start){
        int[] dis=new int[V+1]; //start에서 각 정점까지 거리 저장
        Arrays.fill(dis,Integer.MAX_VALUE); //max로 초기화
        dis[start]=0;
        PriorityQueue<Info> pq = new PriorityQueue<>(Comparator.comparingInt(o->o.cost));
        pq.add(new Info(start,0));
        while(!pq.isEmpty()){
            Info info=pq.poll();
            if(dis[info.idx]!= info.cost) continue; //저장된 정점까지의 거리가 이미 갱신되어 있다면, 생략
            for(Info temp:list[info.idx]){ //연결된 정점 순회
                if(dis[temp.idx]>dis[info.idx]+temp.cost){
                    dis[temp.idx]=dis[info.idx]+temp.cost;
                    pq.add(new Info(temp.idx,dis[temp.idx])); //pq에 정점과 누적된 거리 Info 추가
                }
            }
        }
        print(dis);
    }
    public static void print(int[] dis){
        for(int i=1;i<dis.length;i++){
            if(dis[i]==Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dis[i]);
        }
    }
}
