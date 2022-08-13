package algorithmProgrammers.java.level2;

import java.util.Stack;

public class Solution12936_v3 {
	long k;
	int[] arr;
	boolean[] visit;
	Stack<Integer> st;
	
	public int[] solution(int n, long k) {
		st = new Stack<>();
		arr = new int[n]; // zero
		visit = new boolean[n]; // false
		
		long fact = 1;
		for(int i=1; i<=n; i++) { fact *= i; }
		long gap = (fact / n);
		int start = (int) Math.ceil((double)k / (fact / n)) - 1;
		
		int num = 1;
		for(int i=1; i<n; i++) {
			if(num == start+1) { num++; }
			arr[i] = num++;
		}
		arr[0] = start+1;
		this.k = k - (start * gap);	
		
		perm(n);
		while(!st.empty()) { arr[--n] = st.pop(); }
		
		return arr;
	}
	
	public void perm(int n) {		
		if(st.size() == n) {
			this.k--;
		} else {
			for(int i=0; i<n; i++) {
				if(this.k == 0) break;
				
				if(!visit[i]) {
					visit[i] = true;
					st.push(arr[i]);
					perm(n);
					if(this.k == 0) break;
					st.pop();
					visit[i] = false;
				}
			}
		}
	}
}
