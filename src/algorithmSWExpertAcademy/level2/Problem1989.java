/**
 * 1989. 초심자의 회문 검사
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PyTLqAf4DFAUq&categoryId=AV5PyTLqAf4DFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=1; i<=T; i++) {
			String str = br.readLine().trim();
			String strReverse = new StringBuilder(str).reverse().toString();
			
			int result = str.equals(strReverse) ? 1 : 0;
			sb.append("#"+i+" "+result+"\n");
		}
		
		System.out.print(sb.toString());
	}
}
