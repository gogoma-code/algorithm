/**
 * 점프와 순간 이동
 * https://programmers.co.kr/learn/courses/30/lessons/12980?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12980 {
	public int solution(int n) {
		int ans = 1;
		while(n != 1) {
			if(n % 2 != 0) ans++;
			n /= 2;
		}
        
        return ans;
    }
	
	
	
	public static void main(String[] args) {
		Solution12980 sol = new Solution12980();
		sol.solution(5);
		sol.solution(6);
		sol.solution(5000);
		sol.solution(17);
	}
}
