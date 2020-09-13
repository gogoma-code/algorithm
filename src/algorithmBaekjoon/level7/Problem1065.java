/***
 * 한수 
 * https://www.acmicpc.net/problem/1065
 */
package algorithmBaekjoon.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

public class Problem1065 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (1 <= N && N <= 1000) {
			int cnt = 0;
			for (int x = 1; x <= N; x++) {
				if(hansu(x))
					cnt++;
			}
			System.out.println(cnt);
		}
	}

	public static boolean hansu(int x) {
		boolean flag = true;
		if (x >= 100) {
			List<Integer> list = new Vector<Integer>();
			while (x != 0) {
				list.add(x % 10);
				x /= 10;
			}
			int gap = list.get(0) - list.get(1);
			for(int i=1; i<list.size()-1; i++) {
				if(gap != (list.get(i) - list.get(i+1))) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
