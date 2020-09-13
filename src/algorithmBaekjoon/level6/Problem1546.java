/***
 * 평균 
 * https://www.acmicpc.net/problem/1546
 */
package algorithmBaekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1546 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (1 <= N && N <= 1000) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] gradeArr = new int[N];
			for(int i=0; i<N; i++) {
				gradeArr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(gradeArr);
			
			// 가장 큰 수
			int max = gradeArr[N-1];
			// 적어도 하나의 값은 0 보다 큰 것을 확인하기 위한 조건문
			if (max > 0) {
				double sum = 0;
				for (int i = 0; i < N; i++) {
					int chkNum = gradeArr[i];
					if (0 <= chkNum && chkNum <= 100) {
						sum += (double)chkNum/max*100;
					}
				}
				System.out.println(sum/N);
			}
		}
	}
}
