/**
 * 1936. 1대1 가위바위보
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PjKXKALcDFAUq&categoryId=AV5PjKXKALcDFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1936 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr[] = br.readLine().split(" ");
		int A = Integer.parseInt(numStr[0]);
		int B = Integer.parseInt(numStr[1]);
		
		System.out.print(A > B ? "A" : "B");
	}
}
