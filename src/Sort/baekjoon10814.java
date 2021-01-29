package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
//나이순 정렬
public class baekjoon10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[][] arr = new String[num][2];
		for(int i=0;i<num;i++) {
			arr[i]=br.readLine().split(" ");
		}
		br.close();
		Arrays.sort(arr,new Comparator<String[]>(){
			@Override
			public int compare(String[]a ,String[]b) {
				return Integer.parseInt(a[0])-Integer.parseInt(b[0]);
			}
		});
		for(int i=0;i<num;i++) {
			bw.write(arr[i][0]+" "+arr[i][1]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}