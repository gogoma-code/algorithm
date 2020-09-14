/***
 * 문자열 다루기 기본 
 * https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
 */
package algorithmProgrammers.level1;

public class Solution12918 {
	public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for(int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch < '0' || ch > '9') return false;
        }
        return true;
	}
}
