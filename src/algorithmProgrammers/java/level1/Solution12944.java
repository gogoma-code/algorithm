/***
 * 평균 구하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.stream.IntStream;

public class Solution12944 {
	public double solution(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return (double) sum / arr.length;
	}
	
	public double solution2(int[] arr) {
		return IntStream.of(arr).average().getAsDouble();
	}
}