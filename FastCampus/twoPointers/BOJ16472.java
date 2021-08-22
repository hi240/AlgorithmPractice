package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//고냥이
public class BOJ16472 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N, cnt;
    public static String[] arr;
    public static int[] chr=new int[27];
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        int max=Integer.MIN_VALUE;
        cnt=0;
        int l=1;
        for(int r=1;r<arr.length;r++){
            add(arr[r].charAt(0));
            while(true){
                int kind=0;
                for(int i=0;i<chr.length;i++){
                    if(chr[i]>0) kind++;
                }
                if(kind<=N) break;
                remove(arr[l].charAt(0));
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
    public static void add(char r){
        chr[r-'a']++;
    }
    public static void remove(char r){
        chr[r-'a']--;
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        String[] str =br.readLine().split("");
        arr = new String[str.length+1];
        for(int i=1;i<=str.length;i++){
            arr[i]=str[i-1];
        }
    }
}
