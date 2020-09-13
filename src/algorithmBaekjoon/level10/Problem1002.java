/***
 * 터렛 
 * https://www.acmicpc.net/problem/1002
 */
package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1002 { //�ͷ�
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken()), r2 = Integer.parseInt(st.nextToken());
			
			if(x1==x2 && y1==y2) {
				sb.append((r1==r2 ? -1 : 0) + "\n");
			} else {
				double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
				if(Math.abs(r1-r2) == distance || distance == r1+r2) {
					sb.append("1\n");
				} else if(Math.abs(r1-r2) < distance && distance < r1+r2 ) {
					sb.append("2\n");
				} else {
					sb.append("0\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}
