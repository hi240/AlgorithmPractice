package sort;

import java.util.*;

//파일 정리
public class BOJ20291 {
    public static int N;
    public static StringBuilder sb;
    public static String[] arr;
    public static void main(String[] args) {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr);
        int cnt=1;
        int pass=0;
        for(int i=0;i<N;i++){
            if(pass>0) {
                pass--;
                continue;
            }
            for(int j=i+1;j<N;j++){
                if(arr[i].compareTo(arr[j])==0) {
                    cnt++;
                    pass++;
                }
                else break;
            }
            sb.append(arr[i]).append(" ").append(cnt).append("\n");
            cnt=1;
        }
        System.out.println(sb.toString());
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        sb=new StringBuilder();
        arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.next().split("\\.")[1];
        }
    }
}
