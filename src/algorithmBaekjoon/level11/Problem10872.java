/***
 * 팩토리얼 
 * https://www.acmicpc.net/problem/10872
 */
package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10872 { //���丮��
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.print(factorial(N));
	}
	
	public static int factorial(int n) {
		return n <= 1 ? 1 : n * factorial(n-1);
	}
}
