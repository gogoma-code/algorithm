/**
 * 크기가 작은 부분 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
package algorithmProgrammers.java.level1;

public class Solution147355 {
	public int solution(String t, String p) {
		int tLen = t.length(), pLen = p.length();
		Long pLong = Long.parseLong(p);
		
		int answer = 0;
		for(int i=0; i<=tLen-pLen; i++) {
			Long tLong = Long.parseLong(t.substring(i,i+pLen));
			if(tLong <= pLong) answer++;
		}        
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution147355 sol = new Solution147355();
		sol.solution("3141592", "271");
		sol.solution("500220839878", "7");
		sol.solution("10203", "15");
	}
}
