package backTracking;

import java.util.Scanner;

public class Baekjoon2580_repeat {
	public static int[][] arr = new int[9][9];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		dfs(0,0);
		
	}
	public static void dfs(int w,int h) {
		if(w==9) {
			dfs(0,h+1);
			return;
		}
		if(h==9) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		if(arr[w][h]==0) {
			for(int i=1;i<=9;i++) {
				if(valid(w,h,i)) {
					arr[w][h]=i;
					dfs(w+1,h);
				}
			}
			arr[w][h]=0; //여기에 이게 들어가는 이유는, 만약 i값이 틀렸으면, for문안에서 계속 반복하면서 그 다음수를 넣고 넣어서 대입해보면서 찾아야하기때문에.
			return; //만약 찾지 못했으면 여기까지 와서 0으로 초기화 되고, 이 단계보다 더 전단계로 다시 빠꾸된다.
		}
		dfs(w+1,h); //이건 if(arr[w][h]!=0)일 경우에는 그냥 다음단계로 넘어가라고 심어놓은것.
	}
	public static boolean valid(int w,int h,int value) {
		for(int i=0;i<9;i++) {
			if(value==arr[w][i]) return false;
		}
		for(int i=0;i<9;i++) {
			if(value==arr[i][h]) return false;
		}
		int mini_w = w/3*3;
		int mini_h = h/3*3;
		for(int i=mini_w;i<mini_w+3;i++) {
			for(int j=mini_h;j<mini_h+3;j++) {
				if(value==arr[i][j]) return false;
			}
		}
		return true;
	}
}
