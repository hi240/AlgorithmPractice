package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//20211002
//Strahler 순서
public class BOJ9470 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static int[] incnt,score,maxcnt;
    public static int m,k;
    public static void main(String[] args) throws IOException {
        int testcase=Integer.parseInt(br.readLine());
        while(testcase>0){
            input();
            sol();
            testcase--;
        }
    }
    public static void input() throws IOException {
        String[] st= br.readLine().split(" ");
        k=Integer.parseInt(st[0]);
        m=Integer.parseInt(st[1]);
        int p=Integer.parseInt(st[2]);
        list= new ArrayList[m+1];
        incnt=new int[m+1]; //indegree
        maxcnt=new int[m+1]; //노드가 최댓값으로 업데이트된 횟수 저장
        score=new int[m+1]; //노드의 순서 저장
        for(int i=1;i<=m;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<p;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            list[x].add(y);
            incnt[y]++;
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=m;i++){
            if(incnt[i]==0){
                q.add(i);
                score[i]=1; maxcnt[i]=1; //indegree가 없는 i는 최대갱신횟수도 1번이다.
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            if(maxcnt[x]>1) score[x] +=1; //갱신횟수가 2번이상이면 score에 1을 더한다.
            for(int y:list[x]){
                incnt[y]--;
                if(incnt[y]==0){
                   q.add(y);
                }
                if(score[y]<score[x]) { //이번 노드가 전 노드보다 횟수가 작으면
                    score[y]=score[x]; //횟수 갱신
                    maxcnt[y]=1; //max값 갱신 한번했다고 표시.
                }else if(score[y]==score[x]) maxcnt[y]++; //이미 전노드와 이번노드가 같다면, 갱신횟수누적
            }
        }
        System.out.println(k+" "+score[m]); //해당 테케 번호와 목표값의 순서 출력
    }
}
