/**
 * 소수 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12977 {
	public int solution(int[] nums) {
		int cnt = 0;
		for(int i=0; i<nums.length - 2; i++) {
			for(int j=i+1; j<nums.length - 1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(isPrime(nums[i] + nums[j] + nums[k])) {
						cnt++;
					}
				}
			}
		}
		
        return cnt;
    }
	
	public boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime && num > 1;
	}
	
	public static void main(String[] args) {
		Solution12977 sol = new Solution12977();
		sol.solution(new int[] {1,2,3,4});
		sol.solution(new int[] {1,2,7,6,4});
	}
}
