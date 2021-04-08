package DivideConquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

//피보나치 수 6
public class Beakjoon11444 {
	public static BigInteger bi;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bi = new BigInteger(br.readLine());
		
		//pivo(new BigInteger("0"));
	//	pivo(bi);
		
	} //1000000007
//	public static BigInteger pivo(BigInteger num) {
//		
//		if(!num.equals(new BigInteger("1"))) {
//			 return (pivo(num).divide(new BigInteger("2")));
//		};
//		
//		if(num.equals(new BigInteger("1"))) {
//			BigInteger big = new BigInteger("1");
//			 return (pivo(big));
//		};
//		
//		num=num.divide(new BigInteger("2"));
//		
//		if(num.mod(new BigInteger("2")).equals(new BigInteger("0"))) { //짝수면,
//			
//			 return (pivo(num));
//		};                                       
//		if(!num.mod(new BigInteger("2")).equals(new BigInteger("0"))) { //홀수면,
//			 
//			//return
//		}
//		
//		num=num.divide(new BigInteger("2"));
//		
//				
//	}
}
