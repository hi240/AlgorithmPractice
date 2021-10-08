package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//20211003
//영우는 사기꾼?
public class BOJ14676 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static int[] indeg,satisfaction,cnt;
    public static int n,m,k;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        String[] st= br.readLine().split(" ");
        n=Integer.parseInt(st[0]); m=Integer.parseInt(st[1]); k=Integer.parseInt(st[2]);
        list= new ArrayList[n+1];
        indeg= new int[n+1]; satisfaction=new int[n+1]; cnt=new int[n+1];
        for(int i=1;i<=n;i++)
            list[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            list[x].add(y);
            indeg[y]++; //선행건물갯수 누적
        }
        sol();
    }
    public static void sol() throws IOException {
        boolean chk=true;
        while(k-->0){
            String[] st=br.readLine().split(" ");
            int x=Integer.parseInt(st[0]), y=Integer.parseInt(st[1]);
            if(x==1){ //건설
                if(satisfaction[y]<indeg[y]) chk=false; //만족한 건물 수가 선행건물갯수보다 작으면 거짓 체크.
                cnt[y]++;
                if(cnt[y]==1){ //처음 지어진 건물이라면,
                    for(int z:list[y])
                    satisfaction[z]++; //자식 건물들에게 선행건물이 하나 지어졌다고 알림
                }
            }else{ //파괴
                if(cnt[y]==0) chk=false; //지어진 적이 없는 건물이면 거짓 체크.
                cnt[y]--;
                if(cnt[y]==0){ //해당 건물이 다 파괴된거라면
                    for(int z:list[y])
                    satisfaction[z]--; //자식건물들에게 선행건물이 하나 덜지어졌다고 알림
                }
            }
        }
        if(chk) System.out.println("King-God-Emperor");
        else System.out.println("Lier!");
    }
}
