package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2941 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		br.close();

		// 크로아티아 알파벳 세팅
		String[] c_alpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		boolean[] c_check = new boolean[input.length()];
		int c_cnt = 0; // 크로아티아 알파벳 개수
		int search = 0; // 탐색 위치
		for (int i = 0; i < c_alpha.length; i++) {
			search = input.indexOf(c_alpha[i], search);

			// 탐색 결과 크로아티아 알파벳이라면
			// 이미 중첩되는 크로아티아 알파벳이 존재하지 않도록 한다.
			if (search >= 0) {
				if (c_check[search] == false) {
					for (int j = search; j < search + c_alpha[i].length(); j++) {
						c_check[j] = true;
					}
					c_cnt++;
				}
				search = search + c_alpha[i].length();
				i--;
			}
			// 크로아티아 알파벳이 없다면
			else {
				search = 0;
			}
		}
		// 크로아티아 알파벳을 제외한 남은 알파벳 수를 더한다.
		for(boolean b : c_check) {
			if(b==false)
				c_cnt++;
		}
		bw.write(c_cnt + "\n");
		bw.flush();
		bw.close();
	}
}
