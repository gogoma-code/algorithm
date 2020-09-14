/***
 * 최대공약수와 최소공배수 
 * https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
 */
package algorithmProgrammers.level1;

import java.math.BigInteger;

public class Solution12940 {
	public int[] solution(int n, int m) {
		int gcd = BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).intValue();
		int lcm = n * m / gcd;

		return new int[] { gcd, lcm };
	}
}
