/***
 * 하샤드 수 
 * https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution12947 {
	public boolean solution(int x) {
		int sum = 0;
		for(int tmp=x; tmp>0; tmp/=10) {
			sum += tmp % 10;
		}
		
		return x % sum == 0;
	}
	
	public boolean solution2(int x) {
		int sum = 0;
		for(char ch : String.valueOf(x).toCharArray()) {
			sum += ch - 48;
		}
		
		return x % sum == 0;
	}
	
	public boolean solution3(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - 48).sum();
		return x % sum == 0;
	}
	
	public static void main(String[] args) {
		Solution12947 sol = new Solution12947();
		sol.solution2(10);
		sol.solution2(11);
		sol.solution2(12);
		sol.solution2(13);
	}
}
