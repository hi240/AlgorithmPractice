package graphSearch;

import java.io.IOException;
import java.util.*;
public class Programmers_TripRoute {
    public static String[][] tickets;
    public static boolean[] visit;
    public static String[] answer;
    public static void main(String[] args) throws IOException {
        tickets = new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        visit= new boolean[tickets.length];
        answer=new String[tickets.length+1];
        dfs("ICN",0);
        System.out.println(Arrays.toString(answer));
    }
    public static void dfs(String from,int depth){
        if(depth==tickets.length+1){
            return;
        }
        answer[depth]=from;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<tickets.length;i++){
            if(visit[i]) continue;
            if(tickets[i][0].equals(from)){
                list.add(tickets[i][1]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<tickets.length;i++){
            if(visit[i]) continue;
            if(tickets[i][0].equals(from)&&tickets[i][1].equals(list.get(0))){
                visit[i]=true;
                from=tickets[i][1];
                continue;
            }
        }
        dfs(from,depth+1);
    }
}


