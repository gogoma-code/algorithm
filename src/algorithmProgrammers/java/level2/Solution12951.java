/**
 * JadenCase 문자열 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12951?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12951 {
	public String solution(String s) {
		String[] split = s.split(" ");
		String answer = "";
		for(int i=0; i<split.length; i++) {
			String str = split[i].toLowerCase();
			if(!str.equals("")) {
				str = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
			}
			answer += str + " ";
		}
		
		if(s.charAt(s.length()-1) != ' ') {
			answer = answer.trim();
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution12951 sol = new Solution12951();
		sol.solution("3people unFollowed me");
		sol.solution("for the  last week");
	}
}
