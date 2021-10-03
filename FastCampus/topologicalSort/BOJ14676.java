package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//20211003
//영우는 사기꾼? 진행중
public class BOJ14676 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        input();
    }
    public static void input() throws IOException {
        String[] st= br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        int k=Integer.parseInt(st[2]);
        list= new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            list[x].add(y);
        }
        for(int i=0;i<k;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            if(x==1){
            }else{
            }
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
    }
}
