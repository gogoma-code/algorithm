package algorithmProgrammers.level1;

import java.util.Arrays;

public class Solution12917 {
	public String solution(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new StringBuilder(new String(array)).reverse().toString();
	}
}
