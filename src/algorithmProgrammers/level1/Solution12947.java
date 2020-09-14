/***
 * 하샤드 수 
 * https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */
package algorithmProgrammers.level1;

public class Solution12947 {
	public boolean solution(int x) {
		int sum = 0;
		int tmpX = x;
		while(tmpX != 0) {
			sum += tmpX % 10;
			tmpX /= 10;
		}
		
		return x % sum == 0 ? true : false;
	}
}
