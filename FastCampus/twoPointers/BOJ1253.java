package twoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//좋다
//수의 위치가 다르면 에서 수열임을 나타냄.
public class BOJ1253 {
    public static int N;
    public static int[] arr;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol(){
        Arrays.sort(arr,1,N+1);
        int sum=0;
        for(int i=1;i<=N;i++){
            int l=1,r=N;
            while(l<r){
                if(l==i) l++;
                else if(r==i) r--;
                else {
                    if (arr[i] == arr[l] + arr[r]) {
                        sum++;
                        break;
                    } else if (arr[i] < arr[l] + arr[r]) {
                        r--;
                    } else l++;
                    if (l == r) break;
                }
            }
        }
        System.out.println(sum);
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
