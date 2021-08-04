package search;

import java.util.Scanner;

//예산
public class BOJ2512 {
    public static int N,M;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){

    }
    public static int binary(){
        int res=0;

        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        M=sc.nextInt();
    }
}
