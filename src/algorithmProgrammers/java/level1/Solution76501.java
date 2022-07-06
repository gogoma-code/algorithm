/**
 * 음양 더하기 
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution76501 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0; i<absolutes.length; i++) {
			answer += signs[i] ? absolutes[i] : absolutes[i] * (-1);
		}
        return answer;
    }
}
