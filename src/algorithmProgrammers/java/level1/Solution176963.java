/**
 * 추억 점수
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
package algorithmProgrammers.java.level1;

import java.util.HashMap;
import java.util.Map;

public class Solution176963 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> yearningMap = new HashMap<>();
		for(int i=0; i<name.length; i++) {
			yearningMap.put(name[i], yearning[i]);
		}
		
		int[] answer = new int[photo.length];
		for(int i=0; i<photo.length; i++) {
			for(int j=0; j<photo[i].length; j++) {
				int score = yearningMap.getOrDefault(photo[i][j], 0);
				answer[i] += score;
			}
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution176963 sol = new Solution176963();
		String[] name = new String[] { "may", "kein", "kain", "radi" };
		int[] yearning = new int[] { 5, 10, 1, 3 };
		String[][] photo = new String[][] { {"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"} };
		
		sol.solution(name, yearning, photo);
	}
}
