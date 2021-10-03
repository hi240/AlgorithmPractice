package etc;

import java.io.IOException;
/*
구현
개미수열
1-1
2-11
3-12
4-1121
5-122111 , 112213 , 12221131, 1123123111 ....등...
1이 하나면 11, 1이 두개면 12 이런식으로 숫자 조합을 쌓아나감. n이 주어지면, n을 개미수열로 표현한걸 출력
구글의 개미수열 정의와는 순서가 다름. 여기는 숫자+몇개 의 순서였다.
 */
public class SKT_3 {
    public static String[] arr;
    public static void main(String[] args) throws IOException {
        int n=8;
        arr= new String[n+1];
        for(int i=1;i<=n;i++){
            sol(i);
        }
        System.out.println(arr[n]);
    }
    public static void sol(int n){
        if(n==1) {
            arr[1] = "1";
            return;
        }
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        char[] ch=arr[n-1].toCharArray();
        sb.append(ch[0]);
        int prev=ch[0];
        int count=1;
        for(int i=1;i<ch.length;i++){
            if(ch[i]==prev){ //직전 수랑 같으면
                count++; //카운트
            }else{ //현재랑 지금 수랑 다르면
                sb.append(count); //count반환해주고
                count=1; //count초기화
                sb.append(ch[i]); //본인 표시
                prev=ch[i]; //이제 본인을 과거로 저장.
            }
        }
        sb.append(count);
        arr[n]=sb.toString();
    }
}
