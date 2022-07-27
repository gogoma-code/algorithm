package algorithmProgrammers.java.level2;

import java.util.ArrayList;
import java.util.List;

public class Solution12936_v4 {
	public int[] solution(int n, long k) {
		int[] answer = new int[n];
		List<Integer> list = new ArrayList<>();
		
		long f = 1;
		for(int i=1; i<=n; i++) {
			list.add(i);
			f *= i;
		}
		
		k--; 
		int idx = 0;
		while(idx < n) {
			f /= n - idx;
			answer[idx++] = list.remove((int) (k / f));
			k %= f;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution12936_v4 sol = new Solution12936_v4();
		int[] out = sol.solution(4, 9);

		for (int o : out) {
			System.out.print(o + " ");
		}
	}
}
