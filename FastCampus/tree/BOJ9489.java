package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20210925
//사촌
public class BOJ9489 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M_index;
    public static int[] nodes;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void sol(){
        int[] par=new int[N]; //노드의 부모노드의 인덱스 저장용
        par[0]=-1; //루트노드의 부모는 -1 처리.
        int group_index=0; //부모노드의 인덱스
        for(int i=1;i<par.length-1;i++){ //부모노드의 인덱스 설정
            par[i]=group_index;
            if(nodes[i]+1!=nodes[i+1]) { //다음값이 연속값이 아니면,
                group_index++; //다음노드를 부모노드로 설정
            }
        }
        par[N-1]=group_index; //마지막 정점도 처리
        //사촌갯수확인하기
        int cnt=0;
        for(int i=1;i<N;i++) { //부모노드는 다르고, 부모의 부모노드는 같아야 사촌
            if (par[i] != par[M_index] && par[par[i]] == par[par[M_index]]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void input() throws IOException {
        while(true){
            String[] st = br.readLine().split(" ");
            N=Integer.parseInt(st[0]); //정점의 개수
            int M=Integer.parseInt(st[1]); //목표 정점
            if(N==0&&M==0) break;

            String[] str = br.readLine().split(" ");
            nodes=new int[N];
            for(int i=0;i<str.length;i++){
                nodes[i]=Integer.parseInt(str[i]);
                if(nodes[i]==M) M_index=i; //목표정점의 인덱스 저장
            }
            sol();
        }
    }
}
