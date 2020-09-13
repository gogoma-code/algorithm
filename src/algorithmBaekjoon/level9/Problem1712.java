/***
 * 손익분기점 
 * https://www.acmicpc.net/problem/1712
 */
package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1712 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		int cnt = 0;
		if(C-B <= 0) {
			cnt = -1;
		} else {
			cnt = (int) (A / (C-B)) + 1;
		}
		
		System.out.print(cnt);
	}
}
