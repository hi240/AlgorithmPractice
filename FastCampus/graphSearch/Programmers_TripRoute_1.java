package graphSearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//20210911
//여행경로
public class Programmers_TripRoute_1 {
    public static boolean[] visit;
    public static ArrayList<String> list;
    public static void main(String[] args) throws IOException {
        String[][] tickets = {{}};
        visit = new boolean[tickets.length + 1]; //티켓 사용 표시
        list = new ArrayList<>(); //경로 경우의 수 저장용
        dfs(tickets, "ICN", "ICN", 0);
        Collections.sort(list); //경우의 수 중 빠른 알파벳 대로 정렬
        String[] answer = list.get(0).split(" "); //모든 경로중 가장 빠른 알파벳일때 출력
    }
    public static void dfs(String[][] tickets,String from,String route,int depth){
        if(depth==tickets.length){ //티켓을 다썼으면,
            list.add(route); //경로에 추가하고
            return; //다음 경우의 수로 이동
        }
        for(int i=0;i<tickets.length;i++){
            if(tickets[i][0].equals(from)&&!visit[i]){ //시작점 일치하고,티켓쓴적 없으면
                visit[i]=true; //티켓쓰고
                dfs(tickets,tickets[i][1],route+" "+tickets[i][1],depth+1); //다음목적지로
                visit[i]=false; //티켓사용여부초기화
            }
        }
    }
}
