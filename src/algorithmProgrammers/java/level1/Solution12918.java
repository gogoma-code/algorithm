/***
 * 문자열 다루기 기본 
 * https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12918 {
	public boolean solution(String s) {
		int len = s.length();
		if (len == 4 || len == 6) {
			for (char ch : s.toCharArray()) {
				if (ch < '0' || ch > '9')
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean solution2(String s) {
		int len = s.length();
		return (len == 4 || len == 6) && s.matches("\\d*");
	}

	public boolean solution3(String s) {
		int len = s.length();
		if (len == 4 || len == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Solution12918 sol = new Solution12918();

		sol.solution2("a234");
		sol.solution2("1234");
		sol.solution2("000a0");
		sol.solution2("1");
		sol.solution2("aaaa");
	}
}
