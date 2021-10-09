package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20211008
//게임 개발
public class BOJ1516 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static int[] indeg,time,sum_time;
    public static int n,m,k;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void input() throws IOException {
        n=Integer.parseInt(br.readLine());
        indeg=new int[n+1];
        time=new int[n+1];
        sum_time=new int[n+1];
        list=new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=1;i<=n;i++){
            String[] str=br.readLine().split(" ");
            time[i]=Integer.parseInt(str[0]); //걸리는 시간
            for(int j=1;j<str.length-1;j++){
                list[Integer.parseInt(str[j])].add(i); //선행건물관계성 저장
                indeg[i]++; //선행건물 수 추가
            }
        }
    }
    public static void sol(){
        Queue<Integer>q= new LinkedList<>();
        for(int i=1;i<n+1;i++){
            if(indeg[i]==0) { //제일 먼저 지어진 건물은 초기값 설정
                q.add(i);
                sum_time[i]=time[i];
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            for(int y:list[x]){ //건물지어졌다고 알리기
                indeg[y]--; //선행건물갯수 감소
                sum_time[y]=Math.max(sum_time[y],time[y]+sum_time[x]); //누적된 시간이랑 이번 선행건물까지의 시간 비교
                if(indeg[y]==0) q.add(y); //선행건물 다 지어졌으면, 대기열에 추가
            }
        }
        for(int i=1;i<n+1;i++){
            System.out.println(sum_time[i]); //순서대로 걸린 시간 출력
        }
    }
}
