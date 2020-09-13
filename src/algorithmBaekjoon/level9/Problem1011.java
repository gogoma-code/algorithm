/***
 * Fly me to the Alpha Centauri
 * https://www.acmicpc.net/problem/1011
 */
package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1011 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[] input = br.readLine().split(" ");
			int dist = Integer.parseInt(input[1]) - Integer.parseInt(input[0]);
			dist = (int)(Math.sqrt(dist-0.5)*2);
			bw.write(dist + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
