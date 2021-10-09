package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20211009
//작업
public class BOJ2056 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static int[] indeg,time,sum_time;
    public static int n;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void input() throws IOException {
        n=Integer.parseInt(br.readLine());
        list= new ArrayList[n+1];
        indeg=new int[n+1];
        time=new int[n+1];
        sum_time=new int[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=1;i<n+1;i++){
            String[] st= br.readLine().split(" ");
            time[i]=Integer.parseInt(st[0]); //소요시간
            int temp=Integer.parseInt(st[1]); //선행 작업 개수
            if(temp==0) continue;
            for(int j=2;j<temp+2;j++){
                list[Integer.parseInt(st[j])].add(i); //선행작업관계성저장
                indeg[i]++; //선행 작업개수 추가
            }
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<n+1;i++){
            if(indeg[i]==0) { //선행작업이 필요없는 작업은
                q.add(i); //대기열에 넣고
                sum_time[i]=time[i]; //시간 초기화
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            for(int y:list[x]){ //선행작업했다고 알리기
                sum_time[y]=Math.max(sum_time[y],time[y]+sum_time[x]); //누적시간이 가장 긴걸로 갱신
                indeg[y]--; //선행작업갯수 줄이기
                if(indeg[y]==0) q.add(y); //선행작업 다하면 대기열 넣기
            }
        }
        int max=0;
        for(int i=0;i<n+1;i++){
            max=Math.max(max,sum_time[i]); //지금껏 가장 오래걸린 작업이, 마지막 작업임
        }
        System.out.println(max);
    }
}
