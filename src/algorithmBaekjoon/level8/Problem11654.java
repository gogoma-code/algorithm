package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11654 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (input.length() == 1) {
			if (input.matches("^[a-zA-Z0-9]*$")) {
				System.out.println((int)input.charAt(0));
			}
		}
	}
}
