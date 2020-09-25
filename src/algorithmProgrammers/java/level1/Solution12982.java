/***
 * 예산 
 * https://programmers.co.kr/learn/courses/30/lessons/12982?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.Arrays;

public class Solution12982 {
	public int solution(int[] d, int budget) {
		int sum = 0, cnt = 0;
		Arrays.sort(d);
		for(int num : d) {
			sum += num;
			if(sum > budget)
				break;
			cnt++;
		}
		
		return cnt;
	}
}
