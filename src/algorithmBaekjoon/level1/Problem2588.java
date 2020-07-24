package algorithmBaekjoon.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2588 {
	
}

class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int firstNum = Integer.parseInt(br.readLine());
		int secondNum = Integer.parseInt(br.readLine());
		
		//@1.
		int secondNumTemp = secondNum;
		while(secondNumTemp != 0) {
			sb.append((secondNumTemp % 10) * firstNum + "\n");
			secondNumTemp /= 10;
		}
		
		sb.append(firstNum * secondNum);
		System.out.println(sb.toString());
	}
}