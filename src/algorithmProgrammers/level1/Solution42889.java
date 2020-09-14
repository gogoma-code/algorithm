/***
 * 실패율 
 * https://programmers.co.kr/learn/courses/30/lessons/42889?language=java
 */
package algorithmProgrammers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution42889 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		List<Integer> answer_list = new ArrayList<>();
		List<Double> failure_list = new ArrayList<>();
		List<Integer> stages_list = new ArrayList<>(stages.length);
		for(int i=0; i<stages.length; i++) {
			stages_list.add(stages[i]);
		}
		
		double failPercent = 0.0;
		int failCnt = 0, totalCnt = 0;
		for(int i=1; i<=N; i++) {
			totalCnt = stages_list.size();
			for(int j=0; j<stages_list.size(); j++) {
				if(i >= stages_list.get(j)) {
					failCnt++;
					stages_list.remove(j);
					j--;
				}
			}
			failPercent = (double)failCnt / totalCnt;
			failCnt = 0;
			failure_list.add(failPercent);
			for(int j=0; j<failure_list.size(); j++) {
				if(j == failure_list.size()-1) {
					answer_list.add(i);
					break;
				}
				
				if(failPercent > failure_list.get(answer_list.get(j)-1)) {
					answer_list.add(j, i);
					break;
				}
			}
		}
		
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = answer_list.get(i);
		}
		return answer;
    }
}
