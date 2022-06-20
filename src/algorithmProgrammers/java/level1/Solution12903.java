/***
 * 가운데 글자 가져오기 
 * https://programmers.co.kr/learn/courses/30/lessons/12903?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12903 {
	public String solution(String s) {
		int len = s.length();
		return s.substring((len-1) / 2, (len/2) + 1);
	}
}
