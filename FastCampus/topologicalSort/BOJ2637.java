package topologicalSort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//https://www.acmicpc.net/problem/2637
//20211009
//장난감 조립
public class BOJ2637 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<SUB>[] list;
    public static int[][] cnt;
    public static int[] indeg;
    public static int n,m;
    static class SUB{ //기초부품 종류와 갯수 저장
        int num;
        int amount;
        SUB(int num,int amount){
            this.num=num;
            this.amount=amount;
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void input() throws IOException {
        n=Integer.parseInt(br.readLine()); //완성된 최종 부품의 숫자
        m=Integer.parseInt(br.readLine());
        list= new ArrayList[n+1];
        indeg=new int[n+1];
        cnt=new int[n+1][n+1]; //각 필요 기초부품의 개수 저장
        for(int i=1;i<n+1;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]),z=Integer.parseInt(str[2]);
            list[y].add(new SUB(x,z)); //기초부품으로 만들 수 있는 부품들과 관계성 저장
            indeg[x]++;
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<n+1;i++){
            if(indeg[i]==0){ //순수 기초 부품이면
                q.add(i);
                cnt[i][i]=1; //각 갯수 1개라고 표시
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            for(SUB sub:list[x]){ //부품 x로 만들 수 있는 부품
                int num= sub.num; int amount=sub.amount;
                for(int i=1;i<n+1;i++){
                    cnt[num][i]+=cnt[x][i]*amount; //필요한 양만큼 기초부품에서 가져오고 누적시키기
                }
                indeg[num]--;
                if(indeg[num]==0) q.add(num);
            }
        }
        for(int i=1;i<n+1;i++){
            if(cnt[n][i]>0)
                System.out.println(i+" "+cnt[n][i]);
        }
    }
}
