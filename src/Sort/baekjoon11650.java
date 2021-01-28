package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//좌표 정렬하기
public class baekjoon11650 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,new Comparator<int[]>(){
				@Override
				public int compare(int[]a ,int[]b) {
					if(a[0]==b[0]) {
						return a[1]-b[1];
					}else {
						return a[0]-b[0];
					}
				}
		});
		for(int i=0;i<num;i++) {
			bw.write(String.valueOf(arr[i][0]+" "+arr[i][1]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
