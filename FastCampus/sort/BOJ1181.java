package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//단어 정렬
public class BOJ1181 {
    public static int N;
    public static String[] arr;
    public static void main(String[] args) {
        input();
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                if(a.length()!=b.length()){
                    return a.length()-b.length();
                }
                else {
                    return a.compareTo(b);
                }
            }
        });
        System.out.println(arr[0]);
        for(int i=1;i<N;i++){
            if(arr[i].equals(arr[i-1])) continue;
            System.out.println(arr[i]);
        }
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr = new String[N];
        arr[0]="";
        for(int i=0;i<N;i++){
            arr[i]=sc.next();
        }
        sc.close();
    }
}
