package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//고냥이
public class BOJ16472 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N, kind;
    public static String[] arr;
    public static int[] chr=new int[27];
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        int max=Integer.MIN_VALUE;
        int l=1;
        for(int r=1;r<arr.length;r++){
            add(arr[r].charAt(0));
            while(kind>N){
                remove(arr[l++].charAt(0));
            }
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
    public static void add(char r){
        chr[r-'a']++;
        if(chr[r-'a']==1){
            kind++;
        }
    }
    public static void remove(char l){
        chr[l-'a']--;
        if(chr[l-'a']==0) kind--;
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
