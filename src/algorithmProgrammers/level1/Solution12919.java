/***
 * 서울에서 김서방 찾기 
 * https://programmers.co.kr/learn/courses/30/lessons/12919?language=java
 */
package algorithmProgrammers.level1;

public class Solution12919 {
	public String solution(String[] seoul) {
		int idx = 0;
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) idx = i;
		}
		return "김서방은 " + idx + "에 있다";
	}
}
