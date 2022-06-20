/**
 * 위장 
 * https://programmers.co.kr/learn/courses/30/lessons/42578?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class Solution42578 {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		//System.out.println(map);
		
		for(int value : map.values()) {
			answer *= value + 1;
		}
		
		return answer-1;
	}

	public static void main(String[] args) {
		Solution42578 sol = new Solution42578();
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"test1", "head"}, {"test2", "head"}};
		String[][] clothes2 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "headgear"}, {"green_turban", "headgear"}};
		System.out.println(sol.solution(clothes));
		System.out.println(sol.solution(clothes2));
	}
}
