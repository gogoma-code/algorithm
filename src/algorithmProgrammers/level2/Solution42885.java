/**
 * 구명보트 
 * https://programmers.co.kr/learn/courses/30/lessons/42885?language=java
 */
package algorithmProgrammers.level2;

import java.util.Arrays;

public class Solution42885 {
	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		
		int answer = 0, startIdx = 0, endIdx = people.length-1;
		while(startIdx <= endIdx) {
			if(people[startIdx] + people[endIdx] <= limit) {
				startIdx++;
			} 
			endIdx--;
			answer++;
		}
		
        return answer;
    }
}
