package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//20210918
//트리
//트리에서 ArrayList에 정점관계를 저장할때, 정점의 부모를 저장할건지, 자식을 저장할건지 먼저 정하고 시작하자 반드시.
public class BOJ1068 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,DEL,root;
    public static ArrayList<Integer>[] list;
    public static int[] lastnode;//각 정점까지의 단말노드 개수 저장
    public static void main(String[] args) throws IOException {
        input();
        sol();
        System.out.println(lastnode[root]);
    }
    public static void sol(){ //트리에 제거할 정점 제거하기
        if(DEL==root) { //제거할 정점이 루트노드면 바로 종료
            System.out.println("0");
            System.exit(0);
        }
        for(int i=0;i<N;i++){
            if(list[i].contains(DEL)){ //자식노드 중 제거할 정점이 있는지
                list[i].remove(list[i].indexOf(DEL)); //노드에서 제거 정점 삭제
                //list[i].remove(Integer.valueOf(DEL)); //list의 remove()는 대입할 값 자체(Object)와 index 둘 다 가능하다.
            }
        }
        dfs(root,-1);
    } //트리에서 인접리스트의 경우 자식노드만 순회해야할 때는 관계된 정점 반복문에서 반드시 부모노드를 예외처리 해줘야한다..>부모노드를 인자 정보에 추가.
    public static void dfs(int n,int mom){ //루트노드부터 시작해서, 단말노드까지 순회해서 갯수를 누적해서 반환하자
       if(list[n].size()==0){ //단말노드인지 확인.isEmpty() 가능
           lastnode[n]=1; //단말노드면 갯수 반환.
           return;
       }
        for(int i:list[n]){ //정점과 관계된 노드 순회
            if(i==mom) continue; //부모노드는 제외
            dfs(i,n);
            lastnode[n] +=lastnode[i]; //단말노드에서 반환받은 갯수를 누적받아 각 부모노드에 누적
            //SUM+=dfs(i); 각 노드에서 반환되는 값을 누적하는 SUM +=dfs(i)를 쓰려했으나 누적되는 경우가 존재하고, 작은문제>큰문제 순으로 푸는 풀이가 아니기에 기각
        }
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        list = new ArrayList[N];
        lastnode=new int[N];
        for(int i=0;i<N;i++) list[i]= new ArrayList<Integer>();
        String[] str =br.readLine().split(" ");
        for(int i=0;i<N;i++){ //자식노드를 저장하자.
            if(Integer.parseInt(str[i])==-1) { //해당 노드의 부모가 -1이면
                root=i; continue; //루트노드로 지정.
            }
            list[Integer.parseInt(str[i])].add(i); //해당 노드에 자식노드 관계성 저장
        }
        DEL=Integer.parseInt(br.readLine());
    }
}
