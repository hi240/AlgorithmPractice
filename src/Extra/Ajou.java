package Extra;

import java.io.*;
public class Ajou {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		StringBuffer sb = new StringBuffer();
		while(num>0){
			sb.append(num %16);
			num /= 16;
		}
		System.out.println(sb.reverse());
	}
}
