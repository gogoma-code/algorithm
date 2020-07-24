package algorithmBaekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE, maxIdx = 0; //최댓값을 구하기 위한 변수
		for(int i=0; i<9; i++) {
			int num = Integer.parseInt(br.readLine());
			if(max < num) {
				max = num;
				maxIdx = i+1;
			}
		}
		
		System.out.print(max + "\n" + maxIdx);
	}
}
