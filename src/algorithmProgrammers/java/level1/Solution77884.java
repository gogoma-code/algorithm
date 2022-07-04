/**
 * 약수의 개수와 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/77884?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution77884 {
	public int solution(int left, int right) {
		int answer = 0;
		for( int cur=left; cur<=right; cur++ ) {
			int num = cur;
			int total = 1 , count = 0;
			for ( int i = 2; i <= Math.sqrt(num); i++ ) {
				while ( num % i == 0 ) {
					count++;
					num /= i;
				}
				if(count != 0) { 
					total *= (count+1);
					count = 0;
				}
			}
			if( num != 1 ) {
				total *= 2;
			}
			
			answer = total % 2 == 0 ? answer + cur : answer - cur;
		}
		
        return answer;
    }
	
	public int solution2(int left, int right) {
		int answer = 0;
		for ( int num=left; num<=right; num++) {
			if(num % Math.sqrt(num) == 0) answer -= num;
			else answer += num;
		}
		
		return answer;
	}
}
