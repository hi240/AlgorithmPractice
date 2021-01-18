package Brute_Force;

import java.io.IOException;
import java.util.Scanner;

//ü���� �ٽ� ĥ�ϱ�
public class Baekjoon1018_1 {
	static boolean[][] chess ;
	static int min= 64;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		chess= new boolean[x][y]; //x,yĭ ��ŭ�� booleanŸ���� ü���� �����
		for(int i=0;i<x;i++) {
			String str = sc.nextLine(); //���� ũ���� x���� String�� ���� ���̴�.
			for(int j=0;j<y;j++) { //���̰� y�� String�� �ѱ��ھ� ���캼 ���̴�.
				if(str.charAt(j)=='W') { // W�̵� B�̵� ����� ����. 
					chess[i][j]=true;  //ü������ true false true false...�� �ݺ����� �����.
				}else {
					chess[i][j]=false;
				}
			}
		}
		//ü������ 0��°ĭ����~8��°ĭ,1��°����~9��°ĭ ��... 8x8�� ��츦 �� Ȯ���غ��� �ϱ� ������
		//�� �� Ȯ���ؾ� �ϴ��� �����, �Ʒ��� ���� ������ �� �� �ִ�.
		int xcase=x-7; 
		int ycase=y-7;
		for(int i=0;i<xcase;i++) {
			for(int j=0;j<ycase;j++) {
				checkcase(i,j); //checkcase�޼��忡 ����
			}
		}
		System.out.println(min); //checkcase�޼��带 ���� ���� ���� �� ���
	}
	public static void checkcase(int x,int y) { //�� ���� �����ؾ� �ϴ��� ã�� �޼���
		int xendpoint = x+8; //�ε����� x��°���� x+8�� ũ���� ü������ ������ ���̴�.
		int yendpoint = y+8;
		int change=0;
		boolean temp = true; //���Ƿ� ����. true���� false���� ������ �ݴ��� �ǹ̷θ� ���Ǿ� �������.
		for(int i=x;i<xendpoint;i++) {
			for(int j=y;j<yendpoint;j++) {
				if(chess[i][j]!=temp) { //������ ������ true/false���� ��ġ���� ������
					change++; //������Ѿ� �Ǵ� Ÿ���̴� Ƚ���� �����Ѵ�.
				}
				temp = !temp; //��ĭ�� true�� �ݴ�ĭ�� false���� �ؼ� �ٲ��ش�.
			}
			temp =!temp; //������ ������ true������ �ݴ����� ������ false���� �ȴ�.
		}
		change= Math.min(change, 64-change); //ó���� temp�� true�� ��찡 change���, temp�� false�� ���� 64-change �� ��.(8x8=64�ϱ�)
		min=Math.min(min,change); //checkcase�� �ݺ��Ǹ鼭, �ּҰ��� ã�� �� ���� �� ���� min���� ��� ������Ʈ ���ش�.
	}
}
