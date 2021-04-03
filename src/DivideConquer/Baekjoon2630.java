package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//색종이 만들기
/*
8
1 1 0 0 0 0 1 1
1 1 0 0 0 0 1 1
0 0 0 0 1 1 0 0
0 0 0 0 1 1 0 0
1 0 0 0 1 1 1 1
0 1 0 0 1 1 1 1
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
 */
public class Baekjoon2630 {
	static int size;
	static int[][] map;
	static int sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		size=Integer.parseInt(br.readLine());
		map= new int[size][size];
		for(int i=0;i<size;i++) {
			String[] arr=br.readLine().split(" ");
			for(int j=0;j<size;j++) {
				map[i][j]= Integer.parseInt(arr[j]);
			}
		}
		System.out.println(1/2);
		func();
		
	}
	
	public static void func() {
		
		int start=0;
		int end=size/2; //4
		int num=size/2; //2
		
		while(num!=0) {
		
			while(start!=size) {
				
				for(int i=start;i<end;i++) { // 0~2 2~4
					
				}
				           //num = 4 / 2
				start=end; //start= 0 4 / 0 2 4 6
				end=2*num; //end = 4 8 / 2 4 6 8
				
			}
			start=0;
			end=num;
			num /=2; //2
		}
			
	}
}









