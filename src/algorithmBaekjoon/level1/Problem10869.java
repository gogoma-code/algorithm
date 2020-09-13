/***
 * 사칙연산 
 * https://www.acmicpc.net/problem/10869
 */
package algorithmBaekjoon.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10869 {
	public static void main(String argsp[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				if(1 <= num1 && num2 <= 10000) {
					System.out.println(num1 + num2);
					System.out.println(num1 - num2);
					System.out.println(num1 * num2);
					System.out.println(num1 / num2);
					System.out.println(num1 % num2);
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
