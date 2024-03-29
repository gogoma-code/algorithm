/**
 * n^2 배열 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution87390 {
	public int[] solution(int n, long left, long right) {		
		int startIndex = (int) (left % n);
		int len = (int) (right - left) + 1;
		int standardValue = (int) (left / n) + 1;
		
		int i = 0;
		int idx = startIndex, val = startIndex+1;
		int[] arr = new int[len];
		while(i < len) {
			arr[i++] = Math.max(val, standardValue);
			
			idx++;
			if(idx % n == 0) {
				val = 1;
				standardValue++;
			} else {
				val++;
			}
		}
				
        return arr;
    }
}
