/*
> 1	1		1

> 2	2		2
	1+1

>3	2+1		3
	1+2
	1+1+1

>4	2+2		5
	2+1+1
	1+2+1
	1+1+2
	1+1+1+1

>5	2+2+1		8
	2+1+2
	2+1+1+1
	1+2+2
	1+2+1+1
	1+1+2+1
	1+1+1+2
	1+1+1+1+1
 */

package algorithmProgrammers.java.level2;

public class Solution12914 {
	public long solution(int n) {
		int mod = 1234567;
		long r1=1, r2=1;
		
		int count = 1;
		while(count < n) {
			long temp = r2;
			r2 = (r1 + r2) % mod;
			r1 = temp;
			count++;
		}
		
		return r2 % mod;
    }
	
	public static void main(String[] args) {
		Solution12914 sol = new Solution12914();
		long l = sol.solution(5);
		System.out.println(l);
	}
}
