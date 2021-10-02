package topologicalSort;

import java.util.*;

//20211002
//ACM Craft 위상정렬
public class BOJ1005 {
    public static int[] time, sum, indeg;
    public static int aim;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) {
        input();
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int n=sc.nextInt(); //건물개수
            int k=sc.nextInt(); //건물 관계주어지는 횟수
            time=new int[n+1]; //각 건물 건축 시간
            sum=new int[n+1]; //앞 건물부터 본인건물까지 걸린 시간
            indeg=new int[n+1]; //선행한 건물 있는지 확인용
            list=new ArrayList[n+1];
            for(int j=1;j<=n;j++){
                list[j]=new ArrayList<>();
                time[j]=sc.nextInt();
            }
            for(int j=1;j<=k;j++){
                int x=sc.nextInt(), y=sc.nextInt();
                list[x].add(y);
                indeg[y]++;
            }
            aim=sc.nextInt(); //소요시간 구할 목표 건물
            sol();
        }
    }
    public static void sol(){
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<list.length;i++){
            if(indeg[i]==0){ //제일 처음 지어지는 건물
                q.add(i);
                sum[i]=time[i]; //누적시간 = 본인 건축 시간
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            if(x==aim){ //목표건물일 경우 출력
                System.out.println(sum[x]);
                break;
            }
            for(int y:list[x]){ //다음 지어질 건물들
                indeg[y]--;
                sum[y]=Math.max(sum[y],sum[x]+time[y]); //누적시간과 본인건물+이 전 건물누적 중 더 오래걸린 시간으로 누적시간갱신
                if(indeg[y]==0) q.add(y); //선행건물 없으면 시작가능 정점에 추가
            }
        }
    }
}
