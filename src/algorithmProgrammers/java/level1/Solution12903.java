/***
 * 가운데 글자 가져오기 
 * https://programmers.co.kr/learn/courses/30/lessons/12903?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12903 {
	public String solution(String s) {
		String answer = "";
		if(s.length() % 2 == 0) answer = s.substring(s.length()/2 - 1, s.length()/2+1);
		else answer = Character.toString(s.charAt(s.length()/2));
			
		return answer;
	}
}
