package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2741 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int input = Integer.parseInt(br.readLine());
			br.close();
			for(int i=0; i<input; i++)
				System.out.println(i+1);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
