/***
 * 이상한 문자 만들기 
 * https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12930 {
	public String solution(String s) {
		boolean checkEvenOdd = true;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(checkEvenOdd) sb.append(String.valueOf(ch).toUpperCase());
			else sb.append(String.valueOf(ch).toLowerCase());
			
			checkEvenOdd = !checkEvenOdd;
			if(ch == ' ') checkEvenOdd = true;
		}
		
		return sb.toString();
	}
}
