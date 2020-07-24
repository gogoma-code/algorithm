package algorithmBaekjoon.level14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2750 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] sortArr = new int[N];
		for(int i=0; i<N; i++) {
			sortArr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(sortArr);
		for(int sort : sortArr) {
			bw.write(sort + "\n");
		}
		bw.flush();
	}
}
