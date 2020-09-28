/**
 * 짝지어 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12973?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Stack;

public class Solution12973 {
	/*** 시간초과
	public int solution(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				s = s.substring(0, i) + s.substring(i+2, s.length());
				i = -1;
			}
		}
		
        return s.equals("") ? 1 : 0;
    }
    ***/
	
	public int solution(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : s.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(ch);
			} else {
				if(stack.peek() == ch) {
					stack.pop();
				} else {
					stack.push(ch);
				}
			}
		}
		
		return stack.isEmpty() ? 1 : 0;
    }
	
	public static void main(String[] args) {
		Solution12973 sol = new Solution12973();
		System.out.println(sol.solution("baabaa"));
		System.out.println(sol.solution("cdcd"));
	}
}
