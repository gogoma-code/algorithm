package algorithmProgrammers.java;

import java.util.Arrays;
import java.util.Collections;

public class SkillCheckLevel1 {
	public long solution(long n) {
		String[] nArr = String.valueOf(n).split("");

		Arrays.sort(nArr, Collections.reverseOrder());
		String nStr = new String("");
		for (int i = 0; i < nArr.length; i++) nStr += nArr[i];

		return Long.parseLong(nStr);
	}
}
