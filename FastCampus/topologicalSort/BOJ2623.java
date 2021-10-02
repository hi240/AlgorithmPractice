package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20211002
//음악프로그램 위상정렬
public class BOJ2623 {
    public static ArrayList<Integer>[] list; //가수순서저장
    public static int[] indeg; //이 전 순서 있는지
    public static int n; //총 가수 수
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void input() throws IOException {
        String[] str= br.readLine().split(" ");
        n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        indeg=new int[n+1];
        list= new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            String[] st= br.readLine().split(" ");
            for(int j=1;j<Integer.parseInt(st[0]);j++){ //가수 순서 관계성 입력받기
                int x=Integer.parseInt(st[j]);
                int y=Integer.parseInt(st[j+1]);
                list[x].add(y);
                indeg[y]++;
            }
        }
    }
    public static void sol(){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(indeg[i]==0) q.add(i); //제일 먼저 시작할 수 있는 가수들 대기열에 넣기
        }
        ArrayList<Integer> temp = new ArrayList<>(); //최종 가수 순서 기록용
        while(!q.isEmpty()){
            int x= q.poll();
            temp.add(x); //순서 기록
            for(int y:list[x]){ //다음 가수 불러오기
                indeg[y]--;
                if(indeg[y]==0) q.add(y);
            }
        }
        if(temp.size()==n){ //가수 순서와 기록된 순서의 총 가수 수가 같으면 출력
            for(int i:temp) System.out.println(i);
        }
        else System.out.println("0"); //사이클이 있거나 순서가 엉켰다는 뜻
    }
}
