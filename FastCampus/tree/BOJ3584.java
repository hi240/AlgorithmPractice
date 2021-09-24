package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

//20210924
//가장 가까운 공통 조상
public class BOJ3584 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list; //각 노드의 조상노드 모음
    public static HashSet<Integer> node1mom; //node1의 조상노드 모음
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void sol() throws IOException {
        String[] str =br.readLine().split(" ");
        int node1=Integer.parseInt(str[0]);
        int node2=Integer.parseInt(str[1]);
       node1mom = new HashSet<>();
       node1mom.add(node1); //본인노드도 조상에 포함
       momfind(node1); //node1의 조상노드 저장
       common(node2); //node1과 node2의 공통조상노드 확인
    }
    public static void momfind(int node){
        if(list[node].isEmpty()) return;
        node1mom.add(list[node].get(0)); //node1의 조상노드 누적
        momfind(list[node].get(0));
    }
    public static void common(int node){
        if(node1mom.contains(node)){ //node1의 조상노드와 겹치면
            System.out.println(node); //출력
            return;
        }
        common(list[node].get(0)); //node2의 조상노드로 재귀
    }
    public static void input() throws IOException {
        int t_c= Integer.parseInt(br.readLine()); //테스트케이스개수
        for(int i=0;i<t_c;i++){
            int nodenum=Integer.parseInt(br.readLine());
            node(nodenum); //노드개수만큼 관계성 저장 list 생성
            for(int j=0;j<nodenum-1;j++){
                String[] str =br.readLine().split(" ");
                int mom=Integer.parseInt(str[0]);
                int kid=Integer.parseInt(str[1]);
                list[kid].add(mom); //부모노드 저장
            }
            sol(); //공통부모찾기
        }
    }
    static void node(int num){
        list=new ArrayList[num+1];
        for(int i=0;i<list.length;i++){
            list[i]=new ArrayList<>();
        }
    }
}
