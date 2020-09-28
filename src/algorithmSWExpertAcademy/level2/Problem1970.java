/**
 * 1970. 쉬운 거스름돈
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PsIl6AXIDFAUq&categoryId=AV5PsIl6AXIDFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1970 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int currencyAry[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=T; i++) {
			int money = Integer.parseInt(br.readLine());
			sb.append("#"+i+"\n");
			for(int j=0; j<currencyAry.length; j++) {
				int div = money/currencyAry[j];
				money -= div * currencyAry[j];
				sb.append(div + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
