package programmers02;
//Å¸°Ù ³Ñ¹ö
public class TargetNumber2 {
	public static int[] numbers= {1,1,1,1,1};
	public static int target =3;
	public static void main(String[] args) {
		System.out.println(dfs(0,0));
	}
	public static int dfs(int index,int num) {
		if(index==numbers.length) {
			return (num==target)? 1:0;
		}
		return dfs(index+1,num+numbers[index])+dfs(index+1,num-numbers[index]);
	}
}
