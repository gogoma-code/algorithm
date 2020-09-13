/***
 * 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 */
package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10870 { 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
}
