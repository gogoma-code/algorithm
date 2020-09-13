/***
 * 평균은 넘겠지 
 * https://www.acmicpc.net/problem/4344
 */
package algorithmBaekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4344 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		if(C > 0) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<C; i++) {
				String[] lineStr = br.readLine().split(" ");
				int lineCnt = Integer.parseInt(lineStr[0]); // 라인 당 개수
				int sum = 0; // 합
				
				// 평균을 구하기 위해 전체 합을 구하는 반복문
				for(int j=1; j<=lineCnt; j++) {
					int chkNum = Integer.parseInt(lineStr[j]);
					if(0 <= chkNum && chkNum <= 100) {
						sum += chkNum;
					}
				}
				
				// 평균 이상의 학생 수를 구하는 반복문
				int cnt = 0;
				for(int k=1; k<=lineCnt; k++) {
					if((double)sum/lineCnt < Integer.parseInt(lineStr[k])) {
						cnt++;
					}
				}
				
				sb.append(String.format("%.3f%%", ((double)cnt / lineCnt * 100)) + "\n");
			}
			System.out.print(sb.toString());
		}
	}
}
