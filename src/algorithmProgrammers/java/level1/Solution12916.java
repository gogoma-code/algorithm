/***
 * 문자열 내 p와 y의 개수 
 * https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12916 {
	boolean solution(String s) {
		int total = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equalsIgnoreCase("p")) total++;
			else if(s.substring(i, i+1).equalsIgnoreCase("y")) total--;
		}
		
		return total == 0 ? true : false;
	}
}
