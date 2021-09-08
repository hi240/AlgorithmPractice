package graphSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

//물통
public class BOJ2251 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int A,B,C;
    public static int curA,curB,curC;
    public static TreeSet<Integer> set = new TreeSet<>();
    public static int[] from={1,1,2,2,3,3};
    public static int[] to={2,3,1,3,1,2};
    public static void main(String[] args) throws IOException {
        input();
        bfs();
        print();
    }
    public static void bfs(){
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        q.add(0);
        while(!q.isEmpty()){
            curA=q.poll();
            curB=q.poll();
            curC=C-curA-curB;
            for(int i=0;i<6;i++){
                int[] cup={curA,curB,curC};
                cup[to[i]] += cup[from[i]];
                cup[from[i]]=0;
                if(curC==0){
                    q.add(cup[0]);
                    q.add(cup[1]);
                }
            }
        }
    }
    public static void func(int from,int to){
        if(from==1) {
            if (to == 2) {
                curB = curA;
                curA = 0;
                if (curB > B) {
                    curA = curB - B;
                    curB = B;
                }
            }
        }
    }
    public static void print(){
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void input() throws IOException {
        String[] str = br.readLine().split(" ");
        A=Integer.parseInt(str[0]);
        B=Integer.parseInt(str[1]);
        C=Integer.parseInt(str[2]);
        curA=0; curB=0; curC=C;
    }
}
