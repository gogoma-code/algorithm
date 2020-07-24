package algorithmBaekjoon.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1110 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int initNum = Integer.parseInt(br.readLine());
		if (0 <= initNum && initNum <= 99) {
			int sum = 0;
			int front = initNum / 10;
			int back = initNum % 10;
			int cnt = 0;
			while (true) {
				sum = front + back;
				front = back;
				back = sum % 10;
				cnt++;
				if (initNum == Integer.parseInt(Integer.toString(front) + Integer.toString(back))) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
