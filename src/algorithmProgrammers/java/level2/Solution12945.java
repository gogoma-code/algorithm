/**
 * 피보나치 수 
 * https://programmers.co.kr/learn/courses/30/lessons/12945?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12945 {
	public int solution(int n) {
		if(n == 1 || n == 2) return 1;
		int f = solution(n-2) + solution(n-1);
		f %= 1234567;
		return f;
	}
}
