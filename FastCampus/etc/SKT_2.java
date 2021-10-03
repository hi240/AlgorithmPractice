package etc;

import java.io.IOException;
//완전탐색
/*
a b c d e 의 키 값이 주어졌을 떄, |a-b|+|b-c|+|c-d|+|d-e|의 값이 최대값이 되게 abcde의 순서를 바꿔 그 최대값을 출력하세요.
아직도 미완성
 */
public class SKT_2 {
    static int[] arr={20,8,10,14,15};
    static int max;
    public static void main(String[] args) throws IOException {
        max=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("*");
            boolean[] visit = new boolean[arr.length];
            visit[i]=true;
            dfs(arr[i],0,0,visit);
        }
        System.out.println(max);
    }
    public static void dfs(int prev,int sum,int cnt,boolean[] visit){
        System.out.println("V");
        if(cnt==arr.length-1){
            max= Math.max(max,sum);
            System.out.println(max);
            return;
        }
        for(int i=0;i<visit.length;i++){
            if(visit[i]) continue;
            visit[i]=true;
            System.out.println(prev+" "+arr[i]+" "+sum+" "+cnt);
            dfs(arr[i],sum+Math.abs(prev-arr[i]),cnt+1,visit);
        }
    }
}
