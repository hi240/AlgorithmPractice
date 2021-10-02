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
    public static ArrayList<Integer>[] list; //가수순서저장
    public static ArrayList<Integer>[] indeg; //가수순서저장
    public static int[] incnt,score;
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
        indeg= new ArrayList[m+1];
        incnt=new int[m+1];
        score=new int[m+1];
        for(int i=1;i<=m;i++){
            list[i]=new ArrayList<>();
            indeg[i]=new ArrayList<>();
        }
        for(int i=0;i<p;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            list[x].add(y);
            indeg[y].add(x);
            incnt[y]++;
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=m;i++){
            if(incnt[i]==0){
                q.add(i);
                score[i]=1;
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            for(int y:list[x]){
                incnt[y]--;
                if(score[y]<score[x]){
   //갱신 횟수를 카운트하지 않으면.. 처음인지, 두번이상인지 알 수없어서 +1을 안하게 될 수도 있다.
   //그리고 이렇게 안에서만 갱신하면, 이게 진짜 2번이상나와서 그 횟수에서 +1된건지,
    //가장큰 값 한번 만나서 된 값인지 알수없다. 따라서 안에서 가장큰값 갱신하고,기록해놓고,
    //fix된 값일 때, 마지막으로 이 값이 두번 갱신된거였는지 체크해서 업데이트하는게 맞다.
                    score[y]=score[x];
                }else if(score[y]==score[x]){
                    score[y]+=1;
                }
                if(incnt[y]==0){
                   q.add(y);
                }
            }
        }
        System.out.println(k+" "+score[m]);
    }
}
