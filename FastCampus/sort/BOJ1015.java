package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1015 {
    public static int N;
    public static int[] arr,copy;
    public static void main(String[] args) {
        input();
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(copy[i]==arr[j]){
                    copy[i]=j;
                    break;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(copy[i]+" ");
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        copy=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            copy[i]=arr[i];
        }

    }

}
