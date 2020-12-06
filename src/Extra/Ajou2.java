package Extra;

import java.io.*;
public class Ajou2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		int sum =0;
		String[] arr =input.split(" "); //arr[0]=10 arr[1]=20
		int num =Integer.parseInt(arr[0]); //10
		int lastnum = Integer.parseInt(arr[1]); //20 
		while(num<=lastnum) {
			int x = 1;
			int temp = num;
			while(temp>0) {
				x *=(temp%10); 
				temp /=10;
			}
			sum +=x;
			
			num++;
		}
		System.out.println(sum);
	}
}
