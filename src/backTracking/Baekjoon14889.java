package backTracking;

import java.util.Scanner;

//스타트와 링크
/*
4
0 1 2 3
4 0 5 6
7 1 0 2
3 4 5 0
예를 들어, 1, 2번이 스타트 팀, 3, 4번이 링크 팀에 속한 경우에 두 팀의 능력치는 아래와 같다.
스타트 팀: S12 + S21 = 1 + 4 = 5
링크 팀: S34 + S43 = 2 + 5 = 7
1, 3번이 스타트 팀, 2, 4번이 링크 팀에 속하면, 두 팀의 능력치는 아래와 같다.
스타트 팀: S13 + S31 = 2 + 7 = 9
링크 팀: S26 + S62 = 6 + 4 = 10
 */
public class Baekjoon14889 {
	public static int n;
	public static int sum=Integer.MAX_VALUE;
	public static int[][] arr;
	public static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		arr = new int[n][n];
		check= new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		recursive(0,0);
		System.out.println(sum);
	}
	public static void recursive(int at,int depth) {
		if(depth==n/2) {
			diff();
			return;
		}
		for(int i=at;i<n;i++) {
			if(!check[i]) {
				check[i]=true;
				System.out.println((i+1)+" i"+(depth+1)+" depth");
				recursive(i+1,depth+1);
				check[i]=false;
			}
		}
	}
	public static void diff() {
		
		int start=0;
		int link=0;
		for(int i=0;i<n-1;i++) { //for문이 이렇게 되는 이유는 0 대각선 기점으로 반짤리는데 어차피 밑에 식에의해서 더해짐으로!
			for(int j=i+1;j<n;j++) {
				if(check[i]==true&&check[j]==true) {
					start +=arr[i][j];
					start +=arr[j][i];
				}else if(check[i]==false&&check[j]==false) {
					link +=arr[i][j];
					link +=arr[j][i];
				}
			}
		}
		sum=Math.min(sum,Math.abs(start-link));
		
	}
}
