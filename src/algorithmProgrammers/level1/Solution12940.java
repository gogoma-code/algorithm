package algorithmProgrammers.level1;

import java.math.BigInteger;

public class Solution12940 {
	public int[] solution(int n, int m) {
		int gcd = BigInteger.valueOf(m).gcd(BigInteger.valueOf(n)).intValue();
		int lcm = n * m / gcd;

		return new int[] { gcd, lcm };
	}
}
