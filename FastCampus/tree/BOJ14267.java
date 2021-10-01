package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//20211001
//회사 문화 1
public class BOJ14267 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer>[] list; //직속부하 저장
    public static int[] score; //칭찬수 저장
    public static void main(String[] args) throws IOException {
        input();
        print();
    }
    public static void input() throws IOException {
        String[] str=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int m=Integer.parseInt(str[1]);
        score=new int[n+1];
        list=new ArrayList[n+1];
        for(int i=0;i< list.length;i++){
            list[i]= new ArrayList<>();
        }
        String[] st=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            if(i==0) continue;
            list[Integer.parseInt(st[i])].add(i+1); //직속부하 목록에 본인 추가.
        }
        for(int j=0;j<m;j++){
            str=br.readLine().split(" ");
            int i=Integer.parseInt(str[0]);
            int w=Integer.parseInt(str[1]);
            score[i]+=w; //직원의 칭찬 수 저장. 두번 받을 수 있기에 누적한다.
        }
        praise(1);
    }
    public static void praise(int boss){ //직속부하에게 본인 칭찬수 누적
        for(int child:list[boss]){
            score[child]+=score[boss];
            praise(child);
        }
    }
    public static void print(){ //정답출력
        StringBuffer sb =new StringBuffer();
        for(int i=1;i<score.length;i++){
            sb.append(score[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
