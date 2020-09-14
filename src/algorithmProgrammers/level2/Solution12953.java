/**
 * N개의 최소공배수 
 * https://programmers.co.kr/learn/courses/30/lessons/12953?language=java
 */
package algorithmProgrammers.level2;

public class Solution12953 {
	public int solution(int[] arr) {
		int lcm = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			lcm = getLcm(lcm, arr[i]);
		}
		
		return lcm;
	}
	
	public int getGcd(int a, int b) {
		int tmp;
		while(b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}
		
		return a;
	}
	
	public int getLcm(int a, int b) {
		if(a<=0 || b<=0) return -1;
		return a * b / getGcd(a, b);
	}
}
