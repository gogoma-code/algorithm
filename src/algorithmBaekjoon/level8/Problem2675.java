/***
 * 문자열 반복 
 * https://www.acmicpc.net/problem/2675
 */
package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2675 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] input = br.readLine().split(" ");
			int count = Integer.parseInt(input[0]);
			for(int j=0; j<input[1].length(); j++) {
				for(int k=0; k<count; k++) {
					bw.write(input[1].charAt(j));
				}
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
