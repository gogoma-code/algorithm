/**
 * 올바른 괄호 
 * https://programmers.co.kr/learn/courses/30/lessons/12909?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Stack;

public class Solution12909 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
    		char bracket =  s.charAt(i);
    		if(bracket == '(') {
    			stack.push(bracket);
    		} else {
    			if(stack.isEmpty()) {
    				answer = false;
    				break;
    			} 
    			stack.pop();
    		}
    	}

        return answer && stack.isEmpty();
    }
}
