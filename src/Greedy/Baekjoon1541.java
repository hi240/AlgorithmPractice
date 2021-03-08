package Greedy;

import java.util.Scanner;

//ÀÒ¾î¹ö¸° °ýÈ£
public class Baekjoon1541 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] arr = str.split("-");
		int sum = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			int num=0;
			String[] temp =arr[i].split("\\+");
			for(int j=0;j<temp.length;j++) {
				num +=Integer.parseInt(temp[j]);
			}
			
			if(sum==Integer.MAX_VALUE) {
				sum=num;
			}else {
				sum -=num;
			}
			
		}
		System.out.println(sum);
	}

}
