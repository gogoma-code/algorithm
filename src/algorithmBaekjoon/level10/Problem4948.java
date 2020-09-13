/***
 * 베르트랑 공준 
 * https://www.acmicpc.net/problem/4948
 */
package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			int cnt = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (i == 1)
					continue;
				boolean isPrime = true;
				int modNum = 2;
				int sqrt = (int) Math.sqrt(i) + 1;

				while (sqrt != modNum) {
					if (i % modNum == 0) {
						isPrime = false;
						break;
					}
					modNum++;
				}

				if (isPrime) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");

			n = Integer.parseInt(br.readLine());
		}
		br.close();

		bw.flush();
		bw.close();
	}
}
