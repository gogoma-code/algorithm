/***
 * 콜라츠 추측 
 * https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12943 {
	public int solution(int num) {
		int cnt = 0;
		while (cnt++ < 450) {
			if (num == 1)
				return cnt - 1;

			if (num % 2 == 0)
				num /= 2;
			else
				num = (num * 3) + 1;
		}

		return -1;
	}
}
