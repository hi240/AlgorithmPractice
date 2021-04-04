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
	static int blue;
	static int white;
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
		func();
	}
	public static void func() {
		
		int start=0;
		int end=size/2; //4
		int num=size/2; //4
		int index=1;
		
		while(num!=0) {
		
			while(start!=size) {
				int k=map[start][start];
				System.out.println("k "+start+" "+end);
				int count=0;
				Loop1: for(int i=start;i<end;i++) {
					for(int j=start;j<end;j++) {
						if(map[i][j]==3) break Loop1;
						if(map[i][j]==k) {
							count++;
						}else break Loop1;
					}
				}
				if(count==end-start) {
					System.out.println("dd "+start);
					if(k==0) white=count;
					else blue=count;
					for(int i=start;i<end;i++) {
						for(int j=start;j<end;j++) {
							map[i][j]=3;
						}
					}
				}
				start=end;
				index++;
				end=index*num;
			}
			
			index=1;
			start=0;
			num /=2;
			end=num;
			
		}
		
		System.out.println(white);
		System.out.println(blue+"끝");
	}
}









