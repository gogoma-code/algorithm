/***
 * 단어의 개수 
 * https://www.acmicpc.net/problem/1152
 */
package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1152 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int cnt = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			++cnt;
		}
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
	}
}
