package algorithmBaekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10039 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		boolean flag = true;
		for(int i=0; i<5; i++) {
			int input = Integer.parseInt(br.readLine());
			if(0 <= input && input <= 100 && input % 5 == 0) {
				if(input < 40) input = 40;
				sum += input;
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(sum/5);
		}
	}
}
