/***
 * 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12932 {	
	public int[] solution(long n) {
		int len = (""+n).length();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = (int)(n%10);
			n/=10;
		}
		return arr;
	}
	
	public int[] solution2(long n) {
		return new StringBuilder(String.valueOf(n)).reverse().chars().map(ch -> ch - '0').toArray();
	}
}
