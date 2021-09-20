package graphSearch;

import com.sun.javafx.image.IntPixelGetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//이진 검색 트리
public class BOJ5639 {
    public static ArrayList<Integer> list;
    public static int ind;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        input();
        dfs(0,0); //후위순회
        System.out.println(sb.toString());
    }
    public static void dfs(int index,int mom){ //4,3
        if(list.get(index)>list.get(mom)){
            sb.append(list.get(mom)).append('\n').append(list.get(index)).append('\n'); //28
            ind=index+1;
            return;
        }
        dfs(index+1,index);

        sb.append(list.get(mom)).append('\n');
        if(index==50) return;
    }
    public static void input() throws IOException {
        list = new ArrayList<>(); //50 30 24 5 28 45 98 52 60
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            if(str.equals("")) break;
            list.add(Integer.parseInt(str));
        }
        sc.close();
//        tree= new ArrayList[1000001];
//        for(int i=0;i<tree.length;i++){
//            tree[i]=new ArrayList<>();
//        }
    }
}
