/***
 * 자릿수 더하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12931 {
	public int solution(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
	
	public int solution2(int n) {
		String nStr = String.valueOf(n);
		return nStr.chars().sum() - (48 * nStr.length());
	}
	
	public static void main(String[] args) {
		Solution12931 sol = new Solution12931();
		System.out.println(sol.solution2(12345));
	}
}
