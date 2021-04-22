package programmers02;
//Å¸°Ù ³Ñ¹ö
public class TargetNumber {
	public static int[] numbers= {1,1,1,1,1};
	public static int target=3;
	public static int answer=0;
	public static void main(String[] args) {
		dfs(0);
	}
	public static void dfs(int depth) {
		if(depth==numbers.length) {
			int sum=0;
			for(int i:numbers) {
				sum +=numbers[i];
			}
			if(sum==target) answer++;
		}else {
			numbers[depth] *=1;
			dfs(depth+1);
			numbers[depth] *=-1;
			dfs(depth+1);
		}
	}
}
