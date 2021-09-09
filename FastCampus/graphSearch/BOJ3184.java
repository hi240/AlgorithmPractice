package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//양
public class BOJ3184 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int R,C;
    public static int lamb,wolf;
    public static char[][] graph;
    public static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    //.빈필드 #울타리 o양 v늑대
    public static void sol(){
        
    }
    public static void input() throws IOException {
        String[] st = br.readLine().split(" ");
        R=Integer.parseInt(st[0]);
        C=Integer.parseInt(st[1]);
        //그래프
        graph = new char[R][C];
        visit=new boolean[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                graph[i][j]=br.readLine().charAt(j);
            }
        }
    }
}
