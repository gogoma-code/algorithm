/***
 * 사분면 고르기 
 * https://www.acmicpc.net/problem/14681
 */
package algorithmBaekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem14681 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		int quadrant = 0;
		if(y > 0) {
			quadrant = x < 0 ? 2 : 1;
		} else {
			quadrant = x < 0 ? 3 : 4;
		}
		
		System.out.print(quadrant);
	}
}
