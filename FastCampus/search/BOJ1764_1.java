package search;

import java.util.Arrays;
import java.util.Scanner;
//듣보잡 다른 풀이
public class BOJ1764_1 {
    public static int N,M;
    static StringBuilder sb = new StringBuilder();
    public static String[] cantlisten, cantsee;
    public static void main(String[] args) {
        input();
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        cantlisten = new String[N+1];
        cantsee= new String[M+1];
        for(int i=1;i<=N;i++){
            cantlisten[i]=sc.next();
        }
        for(int i=1;i<=M;i++){
            cantsee[i]=sc.next();
        }
        sol();
    }
    public static void sol(){
        Arrays.sort(cantlisten,1,cantlisten.length);
        Arrays.sort(cantsee,1,cantsee.length);
        int sum=0;
        for(int i=1;i<cantlisten.length;i++){
            sum +=binary(1,cantsee.length-1,cantlisten[i],cantsee);
        }
        System.out.println(sum);
        System.out.println(sb.toString());
    }
    public static int binary(int l,int r,String x,String[] see){
        while(l<=r){
            int mid=(l+r)/2;
            if(see[mid].equals(x)){
                sb.append(x).append("\n");
                return 1;
            }else if(see[mid].compareTo(x)<0){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
}
