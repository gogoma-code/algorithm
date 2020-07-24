package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2046 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(num-- > 0) {
			sb.append("#");
		}
		System.out.print(sb.toString());
	}
}
