package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//20210925
//사촌
//list의 인덱스를 해당 수로하면 백만이라 너무 크기때문에 구조체를 새로정의해서
//사용하려했으나 그러면 부모를 검색시 depth로 호출을 해도 정확한 부모와자식 노드값을 아는게
//아니라서 의미가 없었다. 그래서 list의 인덱스를 입력받은 순서로 그냥 설정. 거기다가 부모값만 대입한다.
//자식노드를 담으려면 각 인덱스당 1개 이상의 자식들이 달려야하니까 당연히 list[]를 사용해야함
//그러나 부모노드를 담는 배열을 사용할경우 그냥 배열만 이용해도됨...
//depth의 정보를 노드마다 저장해야하는줄알았는데
//****depth가 같다고 모두 형제가 아니다.****
//부모의 부모가 같고, 부모는 다른. <조건을 충족하는 애면 depth가 같음을 짐작할수있다.
public class BOJ9489 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static ArrayList<NODE>[] list;
   public static int N,goal; //node의 개수
    public static void main(String[] args) throws IOException {
        input();
    }
    static class NODE{ //class정의시 static잊지마.
        int mom;
        int kid;
        NODE(int mom,int kid){
            this.mom=mom;
            this.kid=kid;
        }
    }
    public static void sol(String[] str){
        int depth=0;
        int parent=0;
        int goal_depth=0;
        int prev=0;
        int kidnum=0;
        for(int i=0;i<N;i++){
            int node= Integer.parseInt(str[i]);
            if(node==goal) goal_depth=depth; //목표깊이설정
            if(prev==node-1){  //연속된 수일경우
                depth--;
                parent=list[depth].get(new NODE());
                list[depth].add(new NODE(parent,node));
            }else{ //연속된 수가 아닐 경우
                list[depth].add(new NODE(parent,node));

            }
            parent=node; //부모위치갱신
            depth++; //깊어지기
            prev=node;
            kidnum++;
        }
    }
    public static void input() throws IOException {
        while(true){
            list = new ArrayList[1001]; //관계성 저장 배열 초기화
            for(int i=0;i<list.length;i++){
                list[i] = new ArrayList<NODE>();
            }
            String[] st = br.readLine().split(" ");
            N=Integer.parseInt(st[0]);
            goal=Integer.parseInt(st[1]);
            if(N==0 && goal==0) break; //종료 입력시 종료
            String[] str = br.readLine().split(" ");
            sol(str);
        }

    }
}
