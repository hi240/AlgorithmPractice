package programmers02;
//¡∂¿ÃΩ∫∆Ω
public class Joystick {
	public static void main(String[] args) {
		solution("JEROEN");
	}
  public static int solution(String name) {
        int count = 0;
        char ch=' ';
        int min = name.length()-1;
        for(int i=0;i<name.length();i++){
            ch=name.charAt(i);  
            if(ch>65&&ch<79){
                count += ch-65;
            }else if(ch>=79&&ch<=90){
                count += 91-ch;
            }
            
            int next=i+1;
            while(next<name.length()&&name.charAt(next)=='A'){
                next++;
            }
            min = Math.min(min,i+i+name.length()-next);
            
        }
        count +=min;
        return count;
    }
}