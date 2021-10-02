package topologicalSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//문제 입력을 위한 기본 틀
public class Basic {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list;
    public static int[] indeg;
    public static void main(String[] args) throws IOException {
        int testcase=Integer.parseInt(br.readLine());
        while(testcase>0){
            input();
            sol();
            testcase--;
        }
    }
    public static void input() throws IOException {
        String[] st= br.readLine().split(" ");
        int k=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        int p=Integer.parseInt(st[2]);
        list= new ArrayList[m+1];
        indeg=new int[m+1];
        for(int i=1;i<=m;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<p;i++){
            String[] str= br.readLine().split(" ");
            int x=Integer.parseInt(str[0]),y=Integer.parseInt(str[1]);
            list[x].add(y);
            indeg[y]++;
        }
    }
    public static void sol() {
        Queue<Integer> q = new LinkedList<>();
    }
}
