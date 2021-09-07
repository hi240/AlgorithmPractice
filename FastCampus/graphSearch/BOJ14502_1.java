package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//연구소
public class BOJ14502_1 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N,M;
    public static int[][] arr;
    public static int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        input();
        dfs(0);
    }
    public static void dfs(int depth){
        if(depth==3){
            bfs();
            return;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                    dfs(depth+1);
                }
            }
        }
    }
    public static void bfs(){
        int[][] copy_arr=new int[N][M];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                copy_arr[i][j]=arr[i][j];
                if(copy_arr[i][j]==2){
                    q.add(i);
                    q.add(j);
                }
            }
        }
        while(!q.isEmpty()){
            int x=q.poll();
            int y=q.poll();
            for(int i=0;i<4;i++){
                int temp_x=x+dir[i][0];
                int temp_y=y+dir[i][1];
                if(copy_arr[temp_x][temp_y])
            }
        }
    }
    public static void input() throws IOException {
        String[] str =br.readLine().split(" ");
        N=Integer.parseInt(str[0]);
        M=Integer.parseInt(str[1]);
        arr= new int[N][M];
        for(int i=0;i<N;i++){
            String[] str_ =br.readLine().split(" ");
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(str_[j]);
            }
        }
    }
}
