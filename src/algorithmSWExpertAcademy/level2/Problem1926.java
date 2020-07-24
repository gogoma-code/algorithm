package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1926 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			String numStr = String.valueOf(i);
			numStr = numStr.replaceAll("[369]", "-");
			if(numStr.contains("-")) {
				sb.append(numStr.replaceAll("[^-]", "") + " ");
			} else {
				sb.append(numStr + " ");
			}
		}
		
		System.out.print(sb.toString());
	}
}
