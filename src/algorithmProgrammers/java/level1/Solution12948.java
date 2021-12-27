/***
 * 핸드폰 번호 가리기 
 * https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12948 {
	public String solution(String phone_number) {
		StringBuilder sb = new StringBuilder(phone_number);
		for (int i = 0; i < phone_number.length()-4; i++) {
			sb.setCharAt(i, '*');
		}

		return sb.toString();
	}
	
	// 정규식 전방탐색
	public String solution3(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}
	
	public static void main(String[] args) {
		Solution12948 sol = new Solution12948();
		System.out.println(sol.solution("0103344244"));
	}
}
