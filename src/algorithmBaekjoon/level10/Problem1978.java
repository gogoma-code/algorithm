package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int totalCnt = 0;
		while(N-- != 0) {
			boolean isPrime = true;
			int chkIn = Integer.parseInt(input[N]);
			for(int i=2; i<chkIn; i++) {
				if(chkIn % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && chkIn > 1)
				totalCnt++;
		}
		System.out.println(totalCnt);
	}
}
