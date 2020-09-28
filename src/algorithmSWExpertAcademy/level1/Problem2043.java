/**
 * 2043. 서랍의 비밀번호
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QJ_8KAx8DFAUq&categoryId=AV5QJ_8KAx8DFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr[] = br.readLine().split(" ");
		int P = Integer.parseInt(numStr[0]);
		int K = Integer.parseInt(numStr[1]);
		
		System.out.print(P-K+1);
	}
}
