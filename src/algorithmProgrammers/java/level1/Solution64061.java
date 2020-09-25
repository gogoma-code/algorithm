/***
 * 크레인 인형뽑기 게임 
 * https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.Stack;

public class Solution64061 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    int pushItem = 0;
	    
	    for(int move : moves) {
	    	move--; 
	    	for(int i=0; i<board.length; i++) { 
	    		pushItem = board[i][move];
	    		if(pushItem > 0) {
	    			board[i][move] = 0; 
	    			if(!stack.isEmpty() && pushItem == stack.peek()) { 
	    				stack.pop();
	    				answer += 2;
	    			} else { 
	    				stack.push(pushItem);
	    			}
	    			break;
	    		}
	    	}
	    }
	    
	    return answer;
	}
	
	public static void main(String[] args) {
		Solution64061 sol = new Solution64061();
		System.out.println(sol.solution(new int[][] {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}}, new int[] {1, 5, 3, 5, 1, 2, 1, 4}));
	}
}
