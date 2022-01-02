/***
 * 약수의 합 
 * https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.HashSet;

public class Solution12928 {
	public int solution(int n) {
		int sum = n;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) sum += i;
		}

		return sum;
	}

	public int solution2(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				set.add(i);
				set.add(n / i);
			}
		}
		
		return set.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		Solution12928 sol = new Solution12928();
		//System.out.println(sol.solution2(50));
		
		int val = 3000;
		
		long start = System.currentTimeMillis();
		int ans1 = sol.solution(val);
		long end = System.currentTimeMillis();
		System.out.println("1번 풀이 수행시간: " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		int ans2 = sol.solution2(val);
		end = System.currentTimeMillis();
		System.out.println("2번 풀이 수행시간: " + (end - start) + " ms");
		
		System.out.println("1번 정답: " + ans1);
		System.out.println("2번 정답: " + ans2);
	}
}
