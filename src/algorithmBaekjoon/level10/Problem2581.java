/***
 * 소수 
 * https://www.acmicpc.net/problem/2581
 */
package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int count = 0, sum = 0, min = 0;
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
				sum += i;
				count++;
				if(min == 0) {
					min = i;
				}
			}
		}
		
		if(count > 0) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
	
	// 소수 판별 메소드
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return (isPrime && num > 1) ? true : false;
	}
}
