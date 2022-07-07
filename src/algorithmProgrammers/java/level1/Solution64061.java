/***
 * 크레인 인형뽑기 게임 
 * https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.Stack;

public class Solution64061 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0, doll = 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    
	    for(int move : moves) {
	    	move--; 
	    	for(int i=0; i<board.length; i++) { 
	    		doll = board[i][move];
	    		if(doll > 0) {
	    			board[i][move] = 0; 
	    			if(!stack.isEmpty() && doll == stack.peek()) { 
	    				stack.pop();
	    				answer += 2;
	    			} else { 
	    				stack.push(doll);
	    			}
	    			break;
	    		}
	    	}
	    }
	    
	    return answer;
	}
}
