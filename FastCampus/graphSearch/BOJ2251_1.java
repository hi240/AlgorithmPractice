package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//20210828
//물통
public class BOJ2251_1 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] idx= new int[3];
    public static boolean[][] visit = new boolean[201][201]; //0,1번째 비커의 조합을 저장한다.
    public static TreeSet<Integer> set = new TreeSet<>(); //C비커의 값을 정렬+중복제거해서 바로 저장
    public static int[] from = {0,0,1,1,2,2};
    public static int[] to = {1,2,0,2,0,1};
    public static void main(String[] args) throws IOException {
        input();
        bfs();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" "); //C비커 값 출력
        }
    }
    public static void bfs(){
        Queue<Integer> q = new LinkedList<>(); //q에는 A와 B만 보관한다. (C는 어차피 ab의 차이기때문)
        visit[0][0]=true; //A용량 0,B용량 0일 때부터 시작. 방문체크.
        q.add(0); //A용량
        q.add(0); //B용량
        set.add(idx[2]); //C용량 답에 추가.
        while(!q.isEmpty()){
            int[] cup = new int[3]; //bfs돌때마다, A용량, B용량, C용량 새로 정의할것이다.
            cup[0]=q.poll(); //지금 0번째 비커에 담긴 양
            cup[1]=q.poll(); //지금 1번째 비커에 담긴 양
            cup[2]=idx[2]-cup[0]-cup[1]; //지금 2번째 비커에 담긴 양
            for(int i=0;i<6;i++){ //순회할 모든 경우의 수
                int[] save={cup[0],cup[1],cup[2]}; //각 순회는 개별적으로 이뤄지니까 비커의 담긴 양도 갱신.
                save[to[i]] = save[from[i]]+save[to[i]]; //용량 옮김.
                save[from[i]]=0; //옮긴 비커는 비워짐.
                if(save[to[i]]>idx[to[i]]){ //용량보다 더 커서 넘치면,
                    save[from[i]]=save[to[i]]-idx[to[i]]; //옮기려했던 비커에 도로 붓는다.
                    save[to[i]]=idx[to[i]]; //넘치지 않고, 꽉 차게 바꿨음.
                }
                if(!visit[save[0]][save[1]]){ //이미 해본 경우인지 확인
                    visit[save[0]][save[1]]=true; //아니라면, 방문체크.
                    q.add(save[0]); //A용량
                    q.add(save[1]); //B용량일 경우를 추가해줌.
                    if(save[0]==0) set.add(save[2]); //C가 0이라면, 목적 달성이니까 답에 추가.
                }
            }
        }
    }
    public static void input() throws IOException {
        String[] str= br.readLine().split(" ");
        idx[0]=Integer.parseInt(str[0]);
        idx[1]=Integer.parseInt(str[1]);
        idx[2]=Integer.parseInt(str[2]);
    }
}
