package sort;

import java.util.Scanner;

public class Basic {
    public static int N;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){

    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
