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
	
	public static void main(String[] args) {
		Solution12925 sol = new Solution12925();
		String str = "-195670914";
		
		long start = System.currentTimeMillis();
		sol.solution(str);
		long end = System.currentTimeMillis();
		
		long start2 = System.currentTimeMillis();
		sol.solution2(str);
		long end2 = System.currentTimeMillis();
		
		System.out.println("1번 풀이 수행시간: " + (end - start) + " ms");
		System.out.println("2번 풀이 수행시간: " + (end2 - start2) + " ms");
	}
}
