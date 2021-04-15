package Programmers1;
//Æò±Õ ±¸ÇÏ±â
public class Average {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		solution(arr);
	}
    public static double solution(int[] arr) {
        double sum=0;
        for(double i:arr) {
        	sum +=i;
        }
        double answer = sum/arr.length;
        return answer;
    }
}
