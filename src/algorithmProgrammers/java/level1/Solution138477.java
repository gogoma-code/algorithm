/**
 * 명예의 전당 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution138477 {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> list = new ArrayList<>();
		
		int min = 0;
		for(int i=0; i<score.length; i++) {
			if(list.size() <= k || (list.size() == k && min < score[i])) { 			
				boolean isInsert = false;
				for(int j=0; j<list.size(); j++) {
					if(score[i] < list.get(j)) {
						list.add(j, score[i]);
						isInsert = true;
						break;
					}
				}
				if(!isInsert) list.add(score[i]);
				if(k < list.size()) list.remove(0);
				
				min = list.get(0);
				answer[i] = min;
			}
			
			System.out.println(list);
		}
		
		for(int a : answer) {
			System.out.print(a + " ");
		}
        
        return answer;
    }
	
	public int[] solution2(int k, int[] score) {
		int[] answer = new int[score.length];

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for(int i=0; i<score.length; i++) {
        	pQueue.add(score[i]);
        	
        	if(k < pQueue.size()) {
        		pQueue.poll();
        	}
        	
        	answer[i] = pQueue.peek();
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		Solution138477 sol = new Solution138477();
//		sol.solution(3, new int[] { 10, 100, 20, 150, 1, 100, 200 });
		sol.solution2(4, new int[] { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 });
	}
}
