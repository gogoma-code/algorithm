package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2438 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		if (1 <= input && input <= 100) {
			String star = "";
			for (int i = 0; i < input; i++) {
				star += "*";
				System.out.println(star);
			}
		}
	}
}
