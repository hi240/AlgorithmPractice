package Extra;

import java.io.IOException;
import java.util.Scanner;

//직사각형 네개의 합집합의 면적 구하기
public class baekjoon2669 {
	public static boolean[][] location= new boolean[100][100];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int rectangle=0;
		int x=arr[rectangle][0];
		int y=arr[rectangle][1];
		int end_x=arr[rectangle][2];
		int end_y=arr[rectangle][3];
		
		while(true){
			location[x][y]=true;
			if(x<end_x-1) {
				x++;
			}else if(y<end_y-1){
				y++;
				x=arr[rectangle][0];
			}else {
				rectangle++;
				if(rectangle>3) break;
				x=arr[rectangle][0];
				y=arr[rectangle][1];
				end_x=arr[rectangle][2];
				end_y=arr[rectangle][3];
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(location[i][j])sum++;
			}
		}
		System.out.println(sum);
	}
}
