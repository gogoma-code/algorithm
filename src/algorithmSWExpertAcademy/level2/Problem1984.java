/**
 * 1984. 중간 평균값 구하기
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pw_-KAdcDFAUq&categoryId=AV5Pw_-KAdcDFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1984 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				sum += num;
				if(max < num) max = num;
				if(min > num) min = num;
			}
			sum -= max + min;
			System.out.println("#"+i+" "+Math.round(sum/8.0));
		}
	}
}
