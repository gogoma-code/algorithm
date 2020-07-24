package algorithmBaekjoon.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Problem11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		// @1
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		LinkedList<Integer> Q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) Q.offer(i);
		
		int cnt = 0, i = 0; // @2
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!Q.isEmpty()) { // @3
			cnt++;
			if(cnt % m == 0) { // @4
				sb.append(Q.remove(i--)); 
				if(!Q.isEmpty()) sb.append(", "); 
			}
			i = i == Q.size()-1 ? 0 : i+1; // @5
		}
		sb.append(">");
		System.out.println(sb.toString());
	}	
}
