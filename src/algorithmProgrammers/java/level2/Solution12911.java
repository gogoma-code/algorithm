/**
 * 다음 큰 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12911?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12911 {
	public int solution(int n) {
		int bitCount = Integer.bitCount(n);
		int target = n;
		while(bitCount != Integer.bitCount(++target)) { }
		
		return target-1;
	}
}
