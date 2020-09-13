/***
 * 정수 N개의 합 
 * https://www.acmicpc.net/problem/15596
 */
package algorithmBaekjoon.level7;

public class Problem15596 {
	
	public long sum(int[] a) {
		int sum = 0;
		for(int num : a) {
			sum += num;
		}
		
		return sum;
	}
}
