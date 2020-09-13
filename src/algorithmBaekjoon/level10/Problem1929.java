/***
 * 소수 구하기 
 * https://www.acmicpc.net/problem/1929
 */
package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		br.close();
		
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		
		for(int i=m; i<=n; i++) {
			if(i==1) continue;
			boolean isPrime = true;
			int modNum = 2;
			int sqrt = (int)Math.sqrt(i) + 1;
			
			while(sqrt != modNum) {
				if(i % modNum == 0) {
					isPrime = false;
					break;
				}
				modNum++;
			}
			
			if(isPrime) {
				bw.write(i + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
