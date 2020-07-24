package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphabetAll = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<alphabetAll.length(); i++) {
			sb.append((alphabetAll.charAt(i) - 64) + " ");
		}
		System.out.print(sb.toString());
	}
}
