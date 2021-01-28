package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//소트인사이드
public class baekjoon1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		int[] arr =new int[num.length()];
		for(int i=0;i<num.length();i++) {
			arr[i]=num.charAt(i);
		}
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			bw.write(arr[i]);
		}
		bw.flush();
		bw.close();
	}
}

