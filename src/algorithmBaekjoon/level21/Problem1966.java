package algorithmBaekjoon.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		while(testcase-- != 0) {
			String[] input = br.readLine().split(" ");
			String[] priority_str = br.readLine().split(" ");
			
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]) + 1;
			LinkedList<Integer> priority = new LinkedList<Integer>();
			for(int i=0; i<n; i++) priority.add(Integer.parseInt(priority_str[i]));			
			
			Queue<Integer> Q = new LinkedList<Integer>();
			for(int i=0; i<n; i++) Q.offer(i+1);
			
			int cnt = 0; // 몇 번째에 나왔느냐?
			boolean isMax;
			for(int i=0; !Q.isEmpty(); ) {
				isMax = true;
				for(int j=i; j<Q.size(); j++) {
					if(priority.get(i) < priority.get(j)) {
						int tmp = priority.poll();
						priority.offer(tmp);
						tmp = Q.poll();
						Q.offer(tmp);
						
						isMax = false;
						break;
					}
				}
				if(isMax) {
					cnt++;
					priority.poll();
					int check = Q.poll();
					if(check == m) {
						System.out.println(cnt);
						break;
					}
				}
			}
		}
	}
}
