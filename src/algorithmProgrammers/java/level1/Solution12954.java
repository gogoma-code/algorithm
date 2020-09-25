/***
 * x만큼 간격이 있는 n개의 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12954 {
	public long[] solution(int x, int n) {
		long[] arr = new long[n];
		long next = 0;
		for(int i=0; i<arr.length; i++) arr[i] = next += x;
		
		return arr;
	}
}
