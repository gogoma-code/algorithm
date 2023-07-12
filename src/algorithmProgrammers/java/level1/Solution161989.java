/**
 * 덧칠하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
package algorithmProgrammers.java.level1;

public class Solution161989 {
	public int solution(int n, int m, int[] section) {
		int answer = 0, roll = 0;
		for(int s : section) {
			if(roll < s) {
				roll = s + m - 1;
				answer++;
			}
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution161989 sol = new Solution161989();
//		sol.solution(8, 4, new int[] {2, 3, 6});
//		sol.solution(5, 4, new int[] {1, 3});
//		sol.solution(4, 1, new int[] {1,2,3,4});
	}
}
