/**
 * 옹알이 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution133499 {
	public int solution(String[] babbling) {
		List<String> babbles = new ArrayList<String>();
		babbles.add("aya"); babbles.add("ye"); babbles.add("woo"); babbles.add("ma");
		
		int answer = 0;
		for(String babble : babbling) {
			boolean possible = true;
			Stack<String> possibles = new Stack<String>();
			StringBuilder sb = new StringBuilder();
			
			for(char ch : babble.toCharArray()) {
				sb.append(ch);
				if(babbles.contains(sb.toString())) {
					if(!possibles.isEmpty() && possibles.peek().equals(sb.toString())) {
						possible = false;
						break;
					} else {
						possibles.add(sb.toString());
						sb.setLength(0);
					}
				} 
			}
			
			if(sb.length() == 0 && possible) {
				answer++;
			}
		}
		
        return answer;
    }
	
	public int solution2(String[] babbling) {
		int answer = 0;
		Pattern pattern1 = Pattern.compile("(ayaaya|yeye|woowoo|mama)+");
		Pattern pattern2 = Pattern.compile("^(aya|ye|woo|ma)+?$");
		Matcher matcher = null;
		
		for(String babble : babbling) {
			matcher = pattern1.matcher(babble);
			if(!matcher.find()) {
				matcher = pattern2.matcher(babble);
				if(matcher.find()) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution133499 sol = new Solution133499();
//		sol.solution2(new String[] {"aya", "yee", "u", "maa"});
		sol.solution2(new String[] {"ayaye", "yemawoo", "uuu", "yeye", "mayeye", "yemama", "yemamaye"});
//		sol.solution2(new String[] {"yeaya"});
//		sol.solution2(new String[] {"wooyemawooye"});
//		sol.solution2(new String[] {"yeaya"});
	}
}