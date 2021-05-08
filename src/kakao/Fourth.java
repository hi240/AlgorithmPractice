package kakao;

import java.util.ArrayList;
import java.util.Arrays;

public class Fourth {
	public static int result;
	public static ArrayList<Integer>[] arr;
	public static void main(String[] args) {
		int n=4;
		int[][] roads = {{1,2,1},{3,2,1},{2,4,1}};
		arr = new ArrayList[n+1];
		for(int i=0;i<n+1;i++) {
			arr[i]= new ArrayList<Integer>();
		}
		for(int i=0;i<roads.length;i++) {
			int x = roads[i][0];
			int y = roads[i][1];
			arr[x].add(y);
			arr[y].add(x);
		}
		int[] traps = {2,3};
		dfs(roads,1,4,traps,0);
		System.out.println(result);
	}
	 public static void dfs(int[][] roads,int start,int end,int[] traps,int sum){
	        if(start==end) {
	            result=sum;
	            return;
	        }
	        boolean trap = false;
	        for(int i=0;i<traps.length;i++){
	            if(start==traps[i]){
	                trap=true;
	            }
	        }
	        if(!trap){
	            for(int i=0;i<roads.length;i++){
	                if(roads[i][0]==start){
	                   dfs(roads,roads[i][1],end,traps,sum+roads[i][2]);
	                 }
	             }
	        }else if(trap){
	        	boolean[] check = new boolean[roads.length];
	        	//연결된 모든 선 방향변경.
	        	for(int i:arr[start]) {
	        		for(int j=0;j<roads.length;j++) {
	        			if(!check[j]) {
	        				if(roads[j][0]==i||roads[j][1]==i) {
	        					check[j]=true;
	        					int temp=roads[j][0];
	        					roads[j][0]=roads[j][1];
	        					roads[j][1]=temp;
	        				}
	        			}
	        		}
	        	}
	        	System.out.println(Arrays.toString(roads[0]));
	        	System.out.println(Arrays.toString(roads[1]));
	        	System.out.println(Arrays.toString(roads[2]));
	        	for(int i=0;i<roads.length;i++){
	                if(roads[i][0]==start){
	                   dfs(roads,roads[i][1],end,traps,sum+roads[i][2]);
	                 }
	             }
	        }
	        return;
	    }
}
