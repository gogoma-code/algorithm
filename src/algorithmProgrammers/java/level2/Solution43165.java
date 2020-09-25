/**
 * 타겟 넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.LinkedList;
import java.util.Queue;

class Solution43165 {
	public int solution(int[] numbers, int target) {		
        return bfs(numbers, target);
    }
	
	public int dfs(int[] numbers, int node, int sum, int target) {
		if(node == numbers.length) { return sum == target ? 1 : 0; }
		return dfs(numbers, node+1, sum + numbers[node], target) + dfs(numbers, node+1, sum - numbers[node], target);
	}
	
	
	public int bfs(int[] numbers, int target) {
		int answer = 0;
		
		Queue<int[]> Q = new LinkedList<int[]>();
		Q.offer(new int[] {numbers[0], 0});
		Q.offer(new int[] {-numbers[0], 0});
		
		int[] cur;
		while(!Q.isEmpty()) {
			cur = Q.poll();
			if(cur[1] == numbers.length-1) {
				if(cur[0] == target) { answer += 1; }
			} else {
				Q.offer(new int[] {cur[0] + numbers[cur[1]+1], cur[1]+1});
				Q.offer(new int[] {cur[0] - numbers[cur[1]+1], cur[1]+1});
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution43165 sol = new Solution43165();
		sol.solution(new int[] {1,1,1,1,1}, 3);
	}
}
