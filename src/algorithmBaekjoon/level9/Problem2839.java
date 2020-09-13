/***
 * 설탕 배달 
 * https://www.acmicpc.net/problem/2839
 */
package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2839 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int input = Integer.parseInt(br.readLine());
			if(3 <= input && input <= 5000) {
				for(int i=0; i<=input/3; i++) {
					if( (input - (3*i)) % 5 == 0) {
						System.out.println((input-(3*i))/5 + i);
						break;
					} else if(i == input/3) {
						System.out.println(-1);
						break;
					}
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
