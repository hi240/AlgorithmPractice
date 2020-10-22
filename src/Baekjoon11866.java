import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Queue연습을 위해 요세푸스 문제

public class Baekjoon11866 {
	
		public static void main(String[] args) throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
		 
	    int n = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	     
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		
		while(!que.isEmpty()) {
			for(int i=0;i<n;i++) {
				if(i==k-1) {
					sb.append(que.poll()+",");
				}
				else {
	                que.add(que.poll());
	            }
			}
		}
		
		bw.write((sb.substring(0, sb.length()-2) + ">").toString());
	    bw.flush();
	    bw.close();
	    
		}
		
	}








