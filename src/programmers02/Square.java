package programmers02;
//멀쩡한 사각형
public class Square {
	public static void main(String[] args) {
	}
	public long solution(int w, int h) {
        long answer = 1;        
        answer=(long)w*h-(w+h-gcd(w,h));
        return answer;
    }
    public long gcd(long a,long b){
        if(b==0){
            return (long)a;
        }
        return gcd(b,a%b);
    }
}
