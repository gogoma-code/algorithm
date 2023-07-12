/**
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
package algorithmProgrammers.java.level1;

public class Solution134240 {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		sb.append(0);
		for(int i=food.length-1; i>0; i--) {
			String foodStr = String.valueOf(i).repeat(food[i] / 2);
			sb.insert(0, foodStr);
			sb.append(foodStr);
		}
		
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Solution134240 sol = new Solution134240();
		sol.solution(new int[] {1, 3, 4, 6});
		sol.solution(new int[] {1, 7, 1, 2});
	}
}
