/***
 * 달팽이는 올라가고 싶다 
 * https://www.acmicpc.net/problem/2869
 */
package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2869 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		
		int cnt = (int) (Math.ceil((V-A) / (double)(A-B)) + 1);
		
		System.out.print(cnt);
	}
}
