package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//20211014
//암호코드
public class BOJ2011 {
    static int[] word;
    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        word=new int[str.length()+1]; //word={0,1,0,2}
        for(int i=0;i<str.length();i++){
            word[i+1]=str.charAt(i)-'0';
        }
    }
    public static void pro(){
       int[] dp=new int[word.length+1]; //4
       dp[0]=1;
       for(int i=1;i<word.length;i++){ //1 2 3 4
           System.out.println(i);
          if(word[i]!=0) dp[i]=dp[i-1]+dp[i];
          int temp=word[i]+word[i-1]*10;
          if(temp>=10&&temp<=26) dp[i]=dp[i-2]+dp[i];
       }
        System.out.println(dp[word.length]);
    }
}
