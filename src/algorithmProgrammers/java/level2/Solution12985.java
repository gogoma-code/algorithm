/**
 * 예상 대진표
 * https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12985 {
	public int solution(int n, int a, int b) {
		int cnt = 1;
		while(true) {
			if((a % 2 == 0 && a - 1 == b) || (a % 2 != 0 && a + 1 == b)) break;
			
			a = a % 2 == 0 ? a/2 : a/2+1;
			b = b % 2 == 0 ? b/2 : b/2+1;
			cnt++;
		}
		
        return cnt;
    }
	
	public int solutionV2(int n, int a, int b) {
		return Integer.toBinaryString((a-1)^(b-1)).length();
    }
	
	public static void main(String[] args) {
		Solution12985 sol = new Solution12985();
//		sol.solution(8, 4, 7); //3
//		sol.solution(4, 1, 4); //2
//		sol.solution(8, 1, 2); //1
//		sol.solution(8, 2, 3); //2
//		sol.solution(8, 4, 7); //3
//		sol.solution(8, 1, 6); //3
//		sol.solution(2, 1, 2); //1
//		sol.solution(4, 1, 3); //2
		sol.solutionV2(4, 4, 7); //2
	}
}
