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
        Arrays.sort(narr,1,N+1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            sb.append(upper_bound(1,N,marr[i] )-lower_bound(1,N,marr[i]));
            sb.append(" ");
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
    public static int lower_bound(int l,int r,int x){ //marr[i]랑 같은값 중에 젤 왼쪽인덱스
        int res=r+1;
        while(l<=r){
            int mid=(l+r)/2;
            if(narr[mid]>=x){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
    public static int upper_bound(int l,int r,int x){ //marr[i]랑 같은값중에 젤 오른쪽인덱스
        int res=r+1;
        while(l<=r){
            int mid=(l+r)/2;
            if(narr[mid]>x){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
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
