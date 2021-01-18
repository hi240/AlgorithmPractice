package Brute_Force;

import java.io.IOException;
import java.util.Scanner;

//체스판 다시 칠하기
public class Baekjoon1018_1 {
	static boolean[][] chess ;
	static int min= 64;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		chess= new boolean[x][y]; //x,y칸 만큼의 boolean타입의 체스판 만들기
		for(int i=0;i<x;i++) {
			String str = sc.nextLine(); //행의 크기인 x개의 String을 받을 것이다.
			for(int j=0;j<y;j++) { //길이가 y인 String을 한글자씩 살펴볼 것이다.
				if(str.charAt(j)=='W') { // W이든 B이든 상관은 없다. 
					chess[i][j]=true;  //체스판을 true false true false...의 반복으로 만든다.
				}else {
					chess[i][j]=false;
				}
			}
		}
		//체스판의 0번째칸부터~8번째칸,1번째부터~9번째칸 등... 8x8인 경우를 다 확인해봐야 하기 때문에
		//몇 번 확인해야 하는지 계산후, 아래를 통해 대입해 볼 수 있다.
		int xcase=x-7; 
		int ycase=y-7;
		for(int i=0;i<xcase;i++) {
			for(int j=0;j<ycase;j++) {
				checkcase(i,j); //checkcase메서드에 대입
			}
		}
		System.out.println(min); //checkcase메서드를 통해 나온 최종 값 출력
	}
	public static void checkcase(int x,int y) { //몇 개를 변경해야 하는지 찾는 메서드
		int xendpoint = x+8; //인덱스가 x번째부터 x+8인 크기의 체스판을 뒤져볼 것이다.
		int yendpoint = y+8;
		int change=0;
		boolean temp = true; //임의로 설정. true여도 false여도 어차피 반대의 의미로만 사용되어 상관없다.
		for(int i=x;i<xendpoint;i++) {
			for(int j=y;j<yendpoint;j++) {
				if(chess[i][j]!=temp) { //임의의 지정된 true/false값과 일치하지 않으면
					change++; //변경시켜야 되는 타일이니 횟수를 누적한다.
				}
				temp = !temp; //한칸이 true면 반대칸은 false여야 해서 바꿔준다.
			}
			temp =!temp; //한줄의 시작이 true였으면 반대줄의 시작은 false여야 된다.
		}
		change= Math.min(change, 64-change); //처음에 temp가 true일 경우가 change라면, temp가 false일 경우는 64-change 일 것.(8x8=64니까)
		min=Math.min(min,change); //checkcase가 반복되면서, 최소값을 찾을 때 까지 더 작은 min으로 계속 업데이트 해준다.
	}
}
