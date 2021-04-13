package programmers02;
//큰 수 만들기
public class MakeBigNum {
	public static void main(String[] args) {
		String str="4177252841";
		int k=4;
		System.out.println(solution(str,k));
	}
	public static String solution(String number, int k) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int pop=0;
        char max;
        for(int i=0;i<number.length()-k;i++) {
        	max='0';
        	for(int j=pop;j<=k+i;j++) {
        		System.out.println(j);
        		if(number.charAt(j)>max) {
        			max=number.charAt(j);
        			pop = j+1;
        		}
        	}
        	sb.append(max);
        }
        answer=String.valueOf(sb);
        return answer;
    }
}
