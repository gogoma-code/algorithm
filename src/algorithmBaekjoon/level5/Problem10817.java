/***
 * 세 수 
 * https://www.acmicpc.net/problem/10817
 */
package algorithmBaekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10817 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		if(1<=A && A<=100 && 1<=B && B<=100 && 1<=C && C<=100) {
			int[] numArray = {A, B, C};
			Arrays.sort(numArray);
			System.out.println(numArray[1]);
		}
	}
}
