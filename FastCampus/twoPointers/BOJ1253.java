package twoPointers;

import java.util.Arrays;
import java.util.Scanner;
//좋다
public class BOJ1253 {
    public static int N;
    public static int[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr,1,arr.length);
        int sum=0;
        for(int l=1;l<=N;l++){
            if(chek(l)) sum++;
        }
        System.out.println(sum);
    }
    public static boolean chek(int index){
        int l=1,r=N;
        while(l<r){
            if(l==index){
                l++; continue;
            }else if(r==index){
                r--; continue;
            }
            if(arr[l]+arr[r]==arr[index]) return true;
            if(arr[l]+arr[r]>arr[index]) r--;
            else l++;
        }
        return false;
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
    }
}
