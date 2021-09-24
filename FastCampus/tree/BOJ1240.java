package tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//20210924
//노드사이의 거리 (가중치그래프)
public class BOJ1240 {
    public static ArrayList<node>[] list; //노드 관계성 저장 리스트
    public static class node{
        int node; //연결된 노드
        int dis; //그 노드까지 거리
        node(int node,int dis){
            this.node=node;
            this.dis=dis;
        }
    }
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(); //노드 개수
        int M=sc.nextInt(); //테스트케이스 개수
        list = new ArrayList[N+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<node>();
        }
        for(int i=0;i<N-1;i++){ //연결된 노드의 정보와 거리 받기
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int ndis=sc.nextInt();
            list[n1].add(new node(n2,ndis));
            list[n2].add(new node(n1,ndis));
        }
        for(int i=0;i<M;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            func(n1,0,0,n2); //거리가 궁금한 두 노드 대입
        }
    }
    public static void func(int n1,int prev,int dis,int n2){
        if(n1==n2){ //노드에 도착하면
            System.out.println(dis); //거리 출력
            return;
        }
        for(node n:list[n1]){ //연결된 노드 순회
            if(prev==n.node) continue; //거쳐온 직전 노드는 생략
            func(n.node,n1,dis+n.dis,n2); //거리 누적
        }
    }
}
