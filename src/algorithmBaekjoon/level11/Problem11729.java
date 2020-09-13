/***
 * 하노이 탑 이동 순
 * https://www.acmicpc.net/problem/11729
 */
package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11729 { 
	private static StringBuilder sb;
	private static int count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		sb = new StringBuilder();
		count = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 2, 3);
		System.out.println(count);
		System.out.print(sb.toString());
	}
	
	public static void hanoi(int n, int from, int by, int to) {
		count++;
		
		if(n==1) {
			sb.append(from + " " + to + "\n");
		} else {
			hanoi(n-1, from, to, by); // 1->3->2
			sb.append(from + " " + to + "\n");
			hanoi(n-1, by, from, to); // 2->1->3
		}
	}
}
