package search;

import java.util.Arrays;
import java.util.Scanner;
//숫자 카드 2
public class BOJ10816 {
    public static int N,M;
    public static int[] narr,marr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(narr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
           int upper=upper_bound(1,narr.length-1,marr[i]);
            System.out.println(upper+" u");
           int lower=lower_bound(1,narr.length-1,marr[i]);
            System.out.println(lower+" l");
            int num= upper-lower;
           if(upper!=0&&lower!=0) num+=1;
           sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
    public static int lower_bound(int l,int r,int x){ //marr[i]랑 같은값 중에 젤 왼쪽인덱스스
        int res=r+1;
        while(l<=r){
            int mid=(l+r)/2;
            if(narr[mid]<x){
                l=mid+1;
            }else{
                if(narr[mid]==x)res=mid;
                r=mid-1;
            }
        }
        return res;
    }
    public static int upper_bound(int l,int r,int x){ //marr[i]랑 같은값중에 젤 오른쪽인덱스
        int res=r+1;
        while(l<=r){
            int mid=(l+r)/2;
            if(narr[mid]<=x){
                if(narr[mid]==x)res=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        narr = new int[N+1];
        for(int i=1;i<=N;i++){
            narr[i]=sc.nextInt();
        }
        M=sc.nextInt();
        marr = new int[M];
        for(int i=0;i<M;i++){
            marr[i]=sc.nextInt();
        }

    }
}
