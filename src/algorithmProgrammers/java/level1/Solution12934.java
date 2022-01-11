/***
 * 정수 제곱근 판별  
 * https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12934 {
	public long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) == n)
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		return -1;
	}
	
	public long solution2(long n) {
		long count = 30;
		double x = 1.0;
		while(0 < count--) {
			//System.out.print("(" + x + " + " + "(" + n + " / " + x + ")) / " + 2 + " = ");
			x = (x + (n / x)) / 2;
			//System.out.println(x);
		}
		
		return (x % 1 == 0.0) ? (long) ((x+1) * (x+1)) : -1;
	}
	
	public static void main(String[] args) {
		Solution12934 sol = new Solution12934();
		//System.out.println(sol.solution(4));
		System.out.println(sol.solution2(121));
	}
}
