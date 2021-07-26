/**
 * 3진법 뒤집기
 * https://programmers.co.kr/learn/courses/30/lessons/68935?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution68935 {
	public int solution(int n) {		
		StringBuilder sb = new StringBuilder();
		int current = n;
		int third = 3;
		while(current > 0) {
			sb.append( current % third < 10 ? current % third : (char)(current % third - 10 + 'A') );			
			current /= third;
		}		
		
		return Integer.valueOf(sb.toString(), 3);
	}
	
	public static void main(String[] args) {
		Solution68935 sol = new Solution68935();
		System.out.println(sol.solution(45));
		System.out.println(sol.solution(125));
	}
}
