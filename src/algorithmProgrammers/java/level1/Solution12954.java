/***
 * x만큼 간격이 있는 n개의 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.stream.LongStream;

public class Solution12954 {
	public long[] solution(int x, int n) {
		long[] arr = new long[n];
		long next = 0;
		for(int i=0; i<arr.length; i++) arr[i] = next += x;
		
		return arr;
	}
	
	public long[] solution2(int x  , int n) {
		return LongStream.iterate(x, i->i+x).limit(n).toArray();
	}
	
	public static void main(String[] args) {
		Solution12954 sol = new Solution12954();
		sol.solution2(2, 5);
	}
}
