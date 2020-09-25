/**
 * 최댓값과 최솟값 
 * https://programmers.co.kr/learn/courses/30/lessons/12939?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Arrays;

public class Solution12939 {
	public String solution(String s) {
		String[] sArr = s.split(" ");		
		Arrays.sort(sArr);
		
		return sArr[0] + " " + sArr[sArr.length-1];
	}
}
