/***
 * 문자열을 정수로 바꾸기 
 * https://programmers.co.kr/learn/courses/30/lessons/12925?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12925 {	
	public int solution(String s) {
		char first = s.charAt(0);
		
		boolean minus = (first == '-') ? true : false;
		char[] chAry = s.toCharArray();
		int val = 0, len = chAry.length;
		int i = (first == '-' || first == '+') ? 1 : 0;
		
		while(i < len) {
			val = (chAry[i++] - 48) + (val * 10);
		}
		
		return minus ? -val : val;
	}
	
	public int solution2(String s) {
		return Integer.parseInt(s);
	}
}
