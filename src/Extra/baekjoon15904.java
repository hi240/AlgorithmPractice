package Extra;

import java.io.IOException;
import java.util.Scanner;
//UCPC는 무엇의 약자일까?
public class baekjoon15904 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc =new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();
		
		char[] ch = {'U','C','P','C'};
		int index =0;
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==ch[index]) {
				index++;
			}
			if(index>=4)break;
		}
		
		if(index==4) {
			System.out.println("I love UCPC");
		}else {
			System.out.println("I hate UCPC");
		}
	}
}
