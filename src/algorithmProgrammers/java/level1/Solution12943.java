/***
 * 콜라츠 추측 
 * https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12943 {	
	public int solution(int num) {
		long numL = num;
		for(int cnt=0; cnt<500; cnt++) {
			if(numL == 1) return cnt;
			
			numL = (numL%2 == 0) ? numL/2 : numL*3+1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Solution12943 sol = new Solution12943();
		
		long start = System.currentTimeMillis();
		System.out.println(sol.solution(626331));
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
