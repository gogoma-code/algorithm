/***
 * 약수의 합 
 * https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12928 {
	public int solution(int n) {
		int sum = n;
		for (int i = 1; i <= n / 2; i++)
			if (n % i == 0)
				sum += i;

		return sum;
	}
}
