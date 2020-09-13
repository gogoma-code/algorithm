/***
 * 기찍 N
 * https://www.acmicpc.net/problem/2742
 */
package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2742 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		if(0 <= input && input <= 100000) {
			for(int i=input; i>0; i--)
				System.out.println(i);
		}
	}
}
