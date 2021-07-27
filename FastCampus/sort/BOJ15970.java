package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//화살표 그리기
public class BOJ15970 {
    public static int N;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) {
        input();
        for(int i=0;i<=N;i++){
            Collections.sort(list[i]);
        }
        sol();
    }
    public static void sol(){
        int sum=0;
        for(int i=0;i<=N;i++){
            for(int j=0;j<list[i].size();j++){
               sum+= Math.min(leftCheck(i,j),rightCheck(i,j));
            }
        }
        System.out.println(sum);
    }
    public static int leftCheck(int i,int j){
        if(j==0) return Integer.MAX_VALUE;
        else return list[i].get(j)-list[i].get(j-1);
    }
    public static int rightCheck(int i,int j){
        if(j==list[i].size()-1) return Integer.MAX_VALUE;
        else return list[i].get(j+1)-list[i].get(j);
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        list = new ArrayList[N+1];
        for(int i=0;i<N+1;i++){
            list[i]= new ArrayList<>();
        }
        for(int i=0;i<N;i++){
            int dot=sc.nextInt();
            int color=sc.nextInt();
            list[color].add(dot);
        }
    }
}
