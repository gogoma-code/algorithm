/***
 * 벌집 
 * https://www.acmicpc.net/problem/2292
 */
package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2292 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;
		int max = 1;
		int circle = 0;
		while(num > max) {
			max += circle * 6;
			circle++;
			cnt++;
		}
		cnt = num == 1 ? 1 : cnt;
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}
