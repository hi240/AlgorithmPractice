package programmers03;
//네트워크
public class Network {
	public static void main(String[] args) {
		int n=3;
		int[][] computers= {{1,1,0},{1,1,1},{0,1,1}};
		boolean[] visited = new boolean [n];
		int answer=0;
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				answer++;
				dfs(computers,visited,i);
			}
		}
		System.out.println(answer);
	}
	public static void dfs(int[][] computers,boolean[] visited,int n) {
		
		for(int i=0;i<computers.length;i++) {
			if(!visited[i]&&computers[n][i]==1) {
				visited[i]=true;
				dfs(computers,visited,i);
			}
		}
	}
}
