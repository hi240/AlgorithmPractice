package twoPointers;

import java.util.Scanner;
//부분합
public class BOJ1806 {
    public static int N,S;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        int r=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int l=1;l<=N;l++){
            sum -= arr[l-1]; //for문을 돌았다는 것은, l이 줄어들 차례가 왔다는 의미
            while(sum<S && r<N){ //r의 범위가 배열을 넘지 않게 조심
                sum += arr[++r]; //S를 넘을 때까지 r의 범위를 늘려서 누적
            }
            if(sum>=S)
                min=Math.min(min,r-l+1); //최소 길이 갱신
        }
        if(min==Integer.MAX_VALUE)
            System.out.println("0");
        else
            System.out.println(min);
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        S=sc.nextInt();
        arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
