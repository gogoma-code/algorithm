package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9020 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		int i, diff;
		int x = 0, y = 0;
		while (t-- != 0) {
			diff = Integer.MAX_VALUE;
			int n = Integer.parseInt(br.readLine());
			
			boolean[] prime = eratos(n);
			
			for(i=2; i<=n/2; i++) {
				if(prime[i]) {
					if(prime[n-i]) {
						if( (n-i) - i < diff ) {
							x = i;
							y = n-i;
							diff = y - x;
						}
					}
				}
			}
			
			bw.write(x + " " + y + "\n");
		}	
		bw.flush();
		bw.close();
	}

	public static boolean[] eratos(int n) {
		int i, j;
		int limit = (int) Math.sqrt(n);
		boolean[] prime = new boolean[n + 1];

		for (i = 2; i <= n; i++)
			prime[i] = true;

		for (i = 2; i <= limit; i++) {
			if (prime[i] == true) {
				for (j = i; j * i <= n; j++) {
					prime[i * j] = false;
				}
			}
		}

		return prime;
	}
}
