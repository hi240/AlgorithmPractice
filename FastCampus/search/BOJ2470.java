package search;

import java.util.Arrays;
import java.util.Scanner;
//두 용액
public class BOJ2470 {
    public static int N;
    public static int[] A;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(A,1,N+1);
        int best_sum=Integer.MAX_VALUE;
        int v1=0;
        int v2=0;
        for(int i=1;i<N;i++){
            int candidate= lower_bound(i+1,N,-A[i]);
            if(candidate<N&&Math.abs(A[i]+A[candidate])<best_sum){
                best_sum=Math.abs(A[i]+A[candidate]);
                v1=A[i];
                v2=A[candidate];
            }else if(i<candidate-1&&Math.abs(A[i]+A[candidate-1])<best_sum){
                best_sum=Math.abs(A[i]+A[candidate-1]);
                v1=A[i];
                v2=A[candidate-1];
            }
        }
        System.out.println(v1+" "+v2);
    }
    public static int lower_bound(int L,int R,int X) {
        int res=R+1;
        while(L<=R){
            int mid=(L+R)/2;
            if(A[mid]>=X){
                res=mid;
                R=mid-1;
            }else{
                L=mid+1;
            }
        }
        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        A = new int[N+1];
        for(int i=1;i<=N;i++){
            A[i]=sc.nextInt();
        }
    }
}
