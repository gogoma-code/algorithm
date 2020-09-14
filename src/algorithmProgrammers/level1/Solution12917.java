/***
 * 문자열 내림차순으로 배치하기  
 * https://programmers.co.kr/learn/courses/30/lessons/12917?language=java
 */
package algorithmProgrammers.level1;

import java.util.Arrays;

public class Solution12917 {
	public String solution(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new StringBuilder(new String(array)).reverse().toString();
	}
}
