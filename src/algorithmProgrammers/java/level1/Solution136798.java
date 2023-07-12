/**
 * 기사단원의 무기
 * https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */
package algorithmProgrammers.java.level1;

public class Solution136798 {
	public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int n=2; n<=number; n++) {
        	int divisor = 0;
        	for(int i=1; i<=Math.sqrt(n); i++) {
        		if(n % i == 0) divisor += 2;
        	}
        	if(n % Math.sqrt(n) == 0) divisor--;
        	
        	answer += limit < divisor ? power : divisor;
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution136798 sol = new Solution136798();
//		sol.solution(5, 3, 2);
		sol.solution(10, 3, 2);
	}
}
