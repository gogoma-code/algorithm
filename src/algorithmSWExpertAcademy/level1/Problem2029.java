/**
 * 2029. 몫과 나머지 출력하기
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QGNvKAtEDFAUq&categoryId=AV5QGNvKAtEDFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2029 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=T; i++) {
			String numStr[] = br.readLine().split(" ");
			int first = Integer.parseInt(numStr[0]);
			int second = Integer.parseInt(numStr[1]);
			
			int numDiv = first / second;
			int numMod = first % second;
			
			sb.append("#"+i+" "+numDiv+" "+numMod+"\n");
		}
		System.out.print(sb.toString());
	}
}
