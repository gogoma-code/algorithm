/**
 * 멀쩡한 사각형
 * https://programmers.co.kr/learn/courses/30/lessons/62048?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution62048 {
	public long gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public long solution(int w, int h) {
		return ((long)w * h) - ((long)w + h - gcd(w, h));
    }
	
	public static void main(String[] args) {
		Solution62048 sol = new Solution62048();
		System.out.println(sol.solution(8, 12));
	}
}
