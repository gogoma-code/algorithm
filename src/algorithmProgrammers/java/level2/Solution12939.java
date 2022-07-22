/**
 * 최댓값과 최솟값 
 * https://programmers.co.kr/learn/courses/30/lessons/12939?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Arrays;

public class Solution12939 {
	public String solution(String s) {
		String[] sArr = s.split(" ");

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (String str : sArr) {
			int num = Integer.parseInt(str);
			
			if (min > num) { min = num; }
			if (max < num) { max = num; }
		}

		return min + " " + max;
	}

	public String solution2(String s) {
		String[] sArr = s.split(" ");
		int[] iArr = new int[sArr.length];
		for (int i = 0; i < sArr.length; i++) { iArr[i] = Integer.parseInt(sArr[i]); }

		Arrays.sort(iArr);

		return iArr[0] + " " + iArr[iArr.length - 1];
	}
}
