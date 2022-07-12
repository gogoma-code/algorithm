/**
 * JadenCase 문자열 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12951?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.regex.Pattern;

public class Solution12951 {
	public String solution(String s) {		
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(char ch : s.toCharArray()) {			
			sb.append(flag ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
			flag = (ch == ' ') ? true : false;
		}
		
        return sb.toString();
    }
	
	public String solution2(String s) {
		s = s.toLowerCase();
		s = Pattern.compile("(((^)|(?<= ))[a-z]{1})")
		        .matcher(s)
		        .replaceAll(matche -> matche.group().toUpperCase());
		
		return s;
	}
}
