package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10809 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			bw.write(input.indexOf(alphabet) + " ");
		}
		bw.flush();
		bw.close();
	}
}
