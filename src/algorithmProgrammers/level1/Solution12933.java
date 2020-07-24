package algorithmProgrammers.level1;

import java.util.Arrays;

public class Solution12933 {
	public long solution(long n) {
		String[] nArr = String.valueOf(n).split("");
		Arrays.sort(nArr);

		String nStr = new String("");
		for (int i = nArr.length - 1; i >= 0; i--)
			nStr += nArr[i];

		return Long.parseLong(nStr);
	}
}
