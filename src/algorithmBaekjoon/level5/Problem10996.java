/***
 * 별 찍기 - 21
 * https://www.acmicpc.net/problem/10996
 */
package algorithmBaekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sbEven = new StringBuilder();
		StringBuilder sbOdd = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			if(i%2 == 0) {
				sbEven.append("* ");
			} else {
				sbOdd.append(" *");
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(sbEven.toString() + "\n" + sbOdd.toString());
		}
	}
}
