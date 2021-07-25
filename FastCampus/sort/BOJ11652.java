package sort;

import java.util.Arrays;
import java.util.Scanner;
//카드
public class BOJ11652 {
    public static int N;
    public static long[] arr;
    public static void main(String[] args) {
        input();
        System.out.println(sol());
    }
    public static long sol(){
        Arrays.sort(arr);
        long maxnum = arr[0];
        long maxcnt = 1;
        long curcnt = 1;
        for(int i=1;i<N;i++){
            if(arr[i]==arr[i-1]){
                curcnt++;
                if(arr[i]==maxnum) maxcnt++;
                else if(maxcnt<curcnt) {
                    maxnum=arr[i];
                    maxcnt=curcnt;
                }
            }else{
                curcnt=1;
                if(maxcnt<curcnt){
                    maxnum=arr[i];
                    maxcnt=curcnt;
                }
            }
        }
        return maxnum;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new long[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLong();
        }
    }
}
