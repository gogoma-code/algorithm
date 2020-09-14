/***
 * 핸드폰 번호 가리기 
 * https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
 */
package algorithmProgrammers.level1;

public class Solution12948 {
	public String solution(String phone_number) {
		String answer = new String("");
		for (int i = 0; i < phone_number.length(); i++)
			answer += phone_number.length() - i <= 4 ? phone_number.charAt(i) : "*";

		return answer;
	}
}
