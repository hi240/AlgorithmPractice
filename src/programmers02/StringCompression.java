package programmers02;
//문자열 압축
public class StringCompression {

	public static void main(String[] args) {
		String s="abcabcabcabc6de";
		int min= s.length();
		for(int i=1;i<s.length()/2;i++) {
			min=Math.min(min, solution(s,i));
		}
		System.out.println(min);
	}
	public static int solution(String s,int cut) {
		
		String word="";
		String pattern="";
		int count = 1;
		
		for(int i=0;i<s.length()+cut;i+=cut) { 
			String temp;
			
			if(i>=s.length()) {
				temp="";
			}else if(s.length()<i+cut){
				temp=s.substring(i);
			}else {
				temp=s.substring(i,i+cut);
			}
			
			if(i!=0) {
				if(temp.equals(pattern)) {
					count++;
				}else if(count>=2) {
					word += count+pattern;
					count=1;
				}else {
					word += pattern;
				}
			}
			pattern=temp;
			
		}
		return word.length();
		
	}
	
}
