package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2058 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int sum = 0;
		for(int i=0; i<N.length(); i++) {
			sum += N.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
