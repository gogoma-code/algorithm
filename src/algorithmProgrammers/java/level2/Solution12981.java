/**
 * 영어 끝말잇기
 * https://programmers.co.kr/learn/courses/30/lessons/12981?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.HashSet;
import java.util.Set;

public class Solution12981 {
	public int[] solution(int n, String[] words) {
		Set<String> set = new HashSet<String>();
		String lastWord = new String("");
		int cnt = 1;
		
		for(String word : words) {
			if(!lastWord.equals("") && !word.startsWith(lastWord)) {
				break;
			}
			if(!set.add(word)) {
				break;
			}
			lastWord = String.valueOf(word.charAt(word.length()-1));
			cnt++;
		}
		
		int num = 0, turn = 0;
		if(words.length != set.size()) {
			num = (cnt % n == 0) ? n : cnt % n;
			turn = (cnt % n == 0) ? cnt / n : cnt / n + 1;
		}
		
        return new int[] {num, turn};
    }
	
	public static void main(String[] args) {
		Solution12981 sol = new Solution12981();
//		sol.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
//		sol.solution(5, new String[] {"hello", "observe", "effect", "take", "either"
//				, "recognize", "encourage", "ensure", "establish", "hang"
//				, "gather", "refer", "reference", "estimate", "executive"});
		sol.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"});
	}
}
