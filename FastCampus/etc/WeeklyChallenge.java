package etc;

import java.io.IOException;

//프로그래머스 위클리 챌린지 12주차 - 피로도
public class WeeklyChallenge {
    public static void main(String[] args) throws IOException {
        int[][] dungeons= {{80,20},{50,40},{30,10}};
        System.out.println(solution(80,dungeons));
    }
    static int max;
    public static int solution(int k, int[][] dungeons) {
        int answer = dfs(0,k,dungeons,new boolean[dungeons.length]);
        return answer;
    }
    public static int dfs(int depth,int cur,int[][] dungeons,boolean[] visit){
        if(cur<0){
            return depth-1;
        }
        int temp=0;
        for(int i=0;i<dungeons.length;i++){
            if(!visit[i]){
                visit[i]=true;
                temp=dfs(depth+1,cur-dungeons[i][1],dungeons,visit);
                visit[i]=false;
            }
            max=Math.max(temp,max);
        }
        return max;
    }
}
