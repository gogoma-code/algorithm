/**
 * 둘만의 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution155652 {
	public String solution(String s, String skip, int index) {
		List<Character> list = new ArrayList<>();
		for(int i=0; i<26; i++) list.add((char) ('a'+i));
		for(char c : skip.toCharArray()) list.remove(Character.valueOf(c));
		
		int listSize = list.size();
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			int idx = list.indexOf(c) + index;
			while(listSize <= idx) {
				idx -= listSize;
			}
			
			sb.append(list.get(idx));
		}
		
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Solution155652 sol = new Solution155652();
		sol.solution("aukks", "wbqd", 5);
	}
}
