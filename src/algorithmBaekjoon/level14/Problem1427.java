/***
 * 소트인사이드 
 * https://www.acmicpc.net/problem/1427
 */
package algorithmBaekjoon.level14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Problem1427 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
		int length = (int) (Math.log10(N) + 1);
		Integer[] sortNumbers = new Integer[length];
		for (int i = 0; N != 0; i++) {
			sortNumbers[i] = N % 10;
			N /= 10;
		}
		Arrays.sort(sortNumbers, Collections.reverseOrder());
		for(int num : sortNumbers)
			bw.write(String.valueOf(num));
		bw.flush();
		bw.close();
	}
}
