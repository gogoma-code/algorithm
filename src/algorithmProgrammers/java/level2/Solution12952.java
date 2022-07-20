/**
 * N-Queen
 * https://school.programmers.co.kr/learn/courses/30/lessons/12952?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Arrays;

public class Solution12952 {
	public int solution(int n) {		
		int answer = 0;
		
		for(int first=0; first<n; first++) {
			int[] board = new int[n]; // 행은 인덱스, 열은 값
			Arrays.fill(board, -1);
			
			board[0] = first; 
			answer += checkPutTheQueenAll(board, n, 1);
		}
		
        return answer;
    }
	
	public int checkPutTheQueenAll(int[] board, int n, int row) {
		if(row == n) return 1;
		
		int count = 0;
		for(int col=0; col<n; col++) {
			boolean checkPut = true;
			for(int pick=0; pick<row; pick++) {
				if(col == board[pick] || row-pick == Math.abs(col-board[pick])) {
					checkPut = false;
					break;
				}
			}
			
			if(checkPut) {
				board[row] = col;
				count += checkPutTheQueenAll(board, n, row+1);
			} 
		}
		return count;
	}
	
	public static void main(String[] args) {
		Solution12952 sol = new Solution12952();
		sol.solution(4);
	}
}
