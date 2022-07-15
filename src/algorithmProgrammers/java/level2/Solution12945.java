/**
 * 피보나치 수 
 * https://programmers.co.kr/learn/courses/30/lessons/12945?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12945 {
	// 재귀함수 - 시간초과
	/*
	public int solution(int n) {
		int mod = 1234567;
		if(n == 1 || n == 2) return 1;
		int f = ( (solution(n-2)%mod) + (solution(n-1)%mod) ) % mod;
		return f;
	}
	*/
	
	public int solution2(int n) {
		int count=2, mod=1234567;
		int f1=0, f2=1;
		
		while(n > count) {
			int temp = f2;
			f2 = ( (f1%mod) + (f2%mod) ) % mod;
			f1 = temp;
			count++;
		}
		
		return (f1+f2) % mod;
	}
}
