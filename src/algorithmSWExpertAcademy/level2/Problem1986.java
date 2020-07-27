package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1986 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			int N = Integer.parseInt(br.readLine());
			int result = N%2==0 ? N/2 * (-1) : N/2 + 1;
			System.out.println("#"+i+" "+result);
		}
	}
}
