/***
 * 숫자의 합 
 * https://www.acmicpc.net/problem/11720
 */
package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11720 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String input = br.readLine();
		if(1<=cnt && cnt<=100) {
			int sum = 0;
			for(int i=0; i<cnt; i++) {
				sum += Integer.parseInt(input.substring(i,i+1));
			}
			System.out.println(sum);
		}
	}
}
