/***
 * 숫자의 개수 
 * https://www.acmicpc.net/problem/2577
 */
package algorithmBaekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2577 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNum[] = new int[10];
		int A = Integer.parseInt(br.readLine()); 
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		if(100 <= A && A < 1000 && 100 <= B && B < 1000 && 100 <= C && C < 1000) {
			int result = A*B*C;
			while(result != 0) {
				int chkNum = result%10;
				result /= 10;
				countNum[chkNum]++;
			}
			for(int i=0; i<10; i++) {
				System.out.println(countNum[i]);
			}
		}
	}
}
