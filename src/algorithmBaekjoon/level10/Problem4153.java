/***
 * 직각삼각형 
 * https://www.acmicpc.net/problem/4153
 */
package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem4153 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int lengths[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			
			if(lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0) break; //�ݺ� ����
			
			Arrays.sort(lengths);
			if(Math.pow(lengths[0], 2) + Math.pow(lengths[1], 2) == Math.pow(lengths[2], 2)) {
				sb.append("right\n");
			} else {
				sb.append("wrong\n");
			}
		}
		System.out.print(sb.toString());
	}
}
