package Brute_Force;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//ü���� �ٽ� ĥ�ϱ�
public class Baekjoon1018 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int y=Integer.parseInt(sc.nextLine());
		int x=Integer.parseInt(sc.nextLine());
		String[] chess = new String[y];
		for(int i=0; i<y;i++) {
			chess[i] = sc.nextLine();
		}
		sc.close();

		int[] score = new int[y];
		for(int i=0;i<y;i++) {
			if(chess[i].contains("BWBWBWBW")) {
				score[i]=4;
			}else if(chess[i].contains("BWBWBW")) {
				score[i]=3;
			}else if(chess[i].contains("BWBW")) {
				score[i]=2;
			}else if(chess[i].contains("BW")) {
				score[i]=1;
			}else {
				score[i]=0;
			}
		}
		//score=[1,4,3,2,1,0,2,3,4,2,4]
		int j=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(j+8<=y) { //if y=10
			int sum=0;
			for(int i=j;j<i+8;i++) { //0 1 2 3 4 5 6 7,1 ~8,
				sum+=score[i];
			}
			arr.add(sum);
			j++;
		}
		int max=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>max) {
				max=arr.get(i);
			}
		}

	}
}
