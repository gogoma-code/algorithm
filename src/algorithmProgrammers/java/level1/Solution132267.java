/**
 * 콜라 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
package algorithmProgrammers.java.level1;

public class Solution132267 {
	public int solution(int a, int b, int n) {
		int answer = 0, receive = 0, remainder = 0;
		while (a <= n) {
			receive = (n / a) * b;
			remainder = n % a;
			n = receive + remainder;
			answer += receive;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution132267 sol = new Solution132267();
		sol.solution(2, 1, 20);
		sol.solution(3, 1, 20);
		sol.solution(3, 2, 20);
	}
}
