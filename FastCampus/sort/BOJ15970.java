package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ15970 {
    public static int N,sum;
    public static int[] arr;
    public static ArrayList<Integer>[] list;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        for(int j=1;j<N+1;j++){
            for(int i=0;i<list[i].size();i++){
               // Arrays.sort();
            }
        }
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N];
        list = new ArrayList[N+1];
        for(int i=0;i<N+1;i++){
            list[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<N;i++){
            int coor,color;
            coor=sc.nextInt();
            color=sc.nextInt();
            list[color].add(coor);
        }
    }
}
