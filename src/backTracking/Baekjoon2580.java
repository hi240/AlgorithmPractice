package backTracking;

import java.io.IOException;
import java.util.Scanner;

//½ºµµÄí
/*
0 3 5 4 6 9 2 7 8
7 8 2 1 0 5 6 0 9
0 6 0 2 7 8 1 3 5
3 2 1 0 4 6 8 9 7
8 0 4 9 1 3 5 0 6
5 9 6 8 2 0 4 1 3
9 1 7 6 5 2 0 8 0
6 0 3 7 0 1 9 5 2
2 5 8 3 9 4 7 6 0
 */
public class Baekjoon2580 {
	public static int[][] arr= new int[9][9];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		recursive(0,0);
	}
	public static void recursive(int row,int col) {
		if(col==9) {
			recursive(row+1,0);
			return;
		}
		if(row==9) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		if(arr[row][col]==0) {
			for(int i=1;i<10;i++) {
				if(promising(row,col,i)) {
					arr[row][col]=i;
					recursive(row,col+1);
				}
			}
			arr[row][col]=0;
			return;
		}
		recursive(row,col+1);
	}
	public static boolean promising(int row,int col,int value) {
		for(int i=0;i<9;i++) {
			if(arr[row][i]==value) {
				return false;
			}
		}
		for(int i=0;i<9;i++) {
			if(arr[i][col]==value) {
				return false;
			}
		}
		int w =row/3*3; 
		int h =col/3*3;
		for(int i=w;i<w+3;i++) {
			for(int j=h;j<h+3;j++) {
				if(arr[i][j]==value)
					return false;
			}
		}
		return true;
	}
}