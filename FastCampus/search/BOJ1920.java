package search;

import java.util.Arrays;
import java.util.Scanner;
//수 찾기
public class BOJ1920 {
    public static int N,M;
    public static int[] n_arr,m_arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(m_arr,1,m_arr.length);
        for(int i=0;i<N;i++){
            int a=binary(1,m_arr.length-1, n_arr[i]);
            System.out.println(a);
        }
    }
    public static int binary(int l,int r,int x){
        int res=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(m_arr[mid]<=x){
                if(m_arr[mid]==x){
                    res=1; break;
                }
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        M=sc.nextInt();
        m_arr = new int[M+1];
        for(int i=1;i<=M;i++){
            m_arr[i]=sc.nextInt();
        }
        N=sc.nextInt();
        n_arr = new int[N];
        for(int i=0;i<N;i++){
            n_arr[i]=sc.nextInt();
        }
    }
}
