package algorithmProgrammers.level2;

import java.util.Arrays;

public class Solution12939 {
	public String solution(String s) {
		String[] sArr = s.split(" ");		
		Arrays.sort(sArr);
		
		return sArr[0] + " " + sArr[sArr.length-1];
	}
}
