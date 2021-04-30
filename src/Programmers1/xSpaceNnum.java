package Programmers1;
//x만큼 간격이 있는 n개의 숫자
public class xSpaceNnum {
	public static void main(String[] args) {
		int x= 2;
		int n= 5;
	   long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i]=(long)x*(i+1);
        }
	}
}
