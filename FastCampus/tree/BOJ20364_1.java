package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
//20210924
//부동산 다툼
public class BOJ20364_1 {
    static HashSet<Integer> set = new HashSet<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void sol(int n){
        int cur=n;
        int temp=0;
        while(true){
            if(set.contains(cur)) temp=cur; //이미 점령되었다면 갱신 (가장 최신)
            cur=cur/2; //부모노드로
            if(cur==0) break; //노드 다 탔으면 종료
        }
        System.out.println(temp); //갱신값 또는 초기값 출력
        if(temp==0) set.add(n); //초기값 그대로라면 점령등록
    }
    public static void input() throws IOException {
       String[] str=br.readLine().split(" ");
       int N=Integer.parseInt(str[0]);
       int Q=Integer.parseInt(str[1]);
       for(int i=0;i<Q;i++){
           int n = Integer.parseInt(br.readLine());
           sol(n);
       }
    }
}
