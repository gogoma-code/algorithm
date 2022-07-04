/**
 * 나머지가 1이 되는 수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/87389?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.stream.IntStream;

public class Solution87389 {
	public int solution(int n) {
		int answer = 0;
		for(int i=2; i<n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
        return answer;
    }
	
	public int solution2(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).min().getAsInt();
	}
	
	public static void main(String[] args) {
		Solution87389 sol =  new Solution87389();
		
		int n = 12;
		System.out.println(sol.solution2(n));
	}
}