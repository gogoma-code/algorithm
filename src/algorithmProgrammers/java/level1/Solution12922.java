/***
 * 수박수박수박수박수박수?
 * https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12922 {
	public String solution(int n) {
		String answer = new String("");
		for (int i = 0; i < n; i++)
			answer += i % 2 == 0 ? "수" : "박";

		return answer;
	}
}
