/***
 * 두 정수 사이의 합 
 * https://programmers.co.kr/learn/courses/30/lessons/12912?language=java
 */
package algorithmProgrammers.level1;

public class Solution12912 {
	public long solution(int a, int b) {
		if (a != b) {
			int start = a < b ? a : b;
			int end = a < b ? b : a;
			long sum = 0;
			for (int i = start; i <= end; i++)
				sum += i;

			return sum;

		} else
			return a;
	}
}