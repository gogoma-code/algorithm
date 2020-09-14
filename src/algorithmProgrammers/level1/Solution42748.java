/***
 * K번째 수 
 * https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
 */
package algorithmProgrammers.level1;

import java.util.Arrays;

public class Solution42748 {
	public int[] solution(int[] array, int[][] commands) {
		int commandsLen = commands.length;
		int[] returnArr = new int[commandsLen];
		int i = 0, j = 0, k = 0;
		for(int totalFor = 0; totalFor<commandsLen; totalFor++) {
			i = commands[totalFor][0];
			j = commands[totalFor][1];
			k = commands[totalFor][2];
			
			int[] tmpArr = Arrays.copyOfRange(array, i-1, j);
			Arrays.sort(tmpArr);
			returnArr[totalFor] = tmpArr[k-1];
		}
		return returnArr;
	}
}
