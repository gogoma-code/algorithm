/***
 * 셀프 넘버 
 * https://www.acmicpc.net/problem/4673
 */
package algorithmBaekjoon.level7;

public class Problem4673 {
	public static void main(String args[]) {
		int limit = 10000;
		boolean[] generate = new boolean[limit];
		for(int i=1; i<=limit; i++) {
			if(selfNumber(i) <= 10000) {
				generate[selfNumber(i)-1] = true;
			}
		}
		for(int i=0; i<limit; i++) {
			if(!generate[i]) {
				System.out.println(i+1);
			}
		}
	}
	
	public static int selfNumber(int n) {
		int sum = n;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
