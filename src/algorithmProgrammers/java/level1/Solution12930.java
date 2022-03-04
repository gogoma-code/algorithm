/***
 * 이상한 문자 만들기 
 * https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12930 {	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		boolean evenFlag = true;
		for (char ch : s.toCharArray()) {
			sb.append(evenFlag ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
			evenFlag = (ch == ' ') ? true : !evenFlag;
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Solution12930 sol = new Solution12930();
		long start = System.currentTimeMillis();
		sol.solution("try hello world");
		long end = System.currentTimeMillis();
		System.out.println("1번 풀이 수행시간: " + (end - start) + " ms");
	}
}

