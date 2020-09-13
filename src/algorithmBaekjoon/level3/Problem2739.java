/***
 * 구구단 
 * https://www.acmicpc.net/problem/2739
 */
package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2739 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		if(1<input && input<10) {
			for(int i=1; i<=9; i++) {
				System.out.println(input + " * " + i + " = " + (input*i));
			}
		}
	}
}
