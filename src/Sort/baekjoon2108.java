package Sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//통계학
public class baekjoon2108 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int testnum = sc.nextInt();
		int[] num = new int[testnum];
		int sum =0;
		int mid =0;
		int freq = 0;
		int range = 0;
		
		//산술평균
		for(int i=0;i<testnum;i++) {
			num[i]=sc.nextInt();
			sum +=num[i];
		}
		sum = (int)Math.round(((double)sum/(double)testnum));
		
		//중앙값
		Arrays.sort(num);
		mid=num[(testnum/2)];
		
		//범위
		range=num[testnum-1]-num[0];
		
		//최빈값
		int[] arr= new int[8001];
		for(int i=0;i<num.length;i++) {
			arr[num[i]+4000]++;
		}
		int max2=0;
		for(int i=0;i<arr.length;i++) {
			if(max2<arr[i]) {
				max2=arr[i];
				freq=i-4000;
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max2) {
				count++;
			}
			if(count>1) {
				freq=i-4000;
				break;
			}
		}
		System.out.println(sum);
		System.out.println(mid);
		System.out.println(freq);
		System.out.println(range);
	}
}
