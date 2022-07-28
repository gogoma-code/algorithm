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
}
