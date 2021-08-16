package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//고냥이
public class BOJ16472 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N, cnt;
    public static String[] arr;
    public static boolean[] chr=new char[27];
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        int max=Integer.MIN_VALUE;
        for(int l=1;l<=N;l++){
           int r=l;
           cnt=0;
            //만약에 r이 추가된적이 없으면, 추가하고, cnt++;
            //r이 추가된 적이 없어서 추가하려는데 cnt>N이면? 안됨.
            //r이 추가된적이 있으면, 그냥 continue;
           while(true){
               if(add(r)) continue;
               else break;
           }
           remove(r);
           max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
    public static boolean add(int r){

    }
    public static void remove(int r){

    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        String[] str =br.readLine().split("");
        arr = new String[str.length+1];
        for(int i=1;i<=N;i++){
            arr[i]=str[i-1];
        }
    }
}
