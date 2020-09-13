/***
 * 두 수 비교하기 
 * https://www.acmicpc.net/problem/1330
 */
package algorithmBaekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1330 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		
		String answer = new String();
		if(numA > numB) answer = ">";
		else if(numA < numB) answer = "<";
		else answer = "==";
		
		System.out.print(answer);
	}
}
