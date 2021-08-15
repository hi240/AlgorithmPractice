package twoPointers;

import java.io.*;
//List of Unique Numbers
public class BOJ13144 {
    public static int N;
    public static int[] arr;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        input();
        sol();
    }
    public static void sol() throws IOException {
        int[] num= new int[100001]; //수 중복 확인용 배열
        int r=0;
        long sum=0;
        for(int l=1;l<=N;l++){ //l은 차례대로 늘어나고, r은 되는데까지 늘린다.
            while(r+1<=N && num[arr[r+1]]==0){ //처음쓰는 숫자인지,범위를 안넘는지 체크.
                r++; //while조건에서 이미 확인을 했으므로 안심하고 증가.
                num[arr[r]]++; //해당 수 썼으니 썼다고 표시.
            }
            sum+=r-l+1;
            num[arr[l]]--; //l을 이동시킬예정이니까, 기존 l을 배열에서 제거
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
    public static void input() throws IOException {
        N=Integer.parseInt(br.readLine());
        arr = new int[N+1];
        String[] str =br.readLine().split(" ");
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(str[i-1]);
        }
    }
}
