package algorithmBaekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2446 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int star = N * 2 - 1; 
		int gap = 0;
		
		for(int i=1; i<=N*2-1; i++) {
			for(int j=0; j<gap; j++) sb.append(" ");			
			for(int j=0; j<star; j++) sb.append("*");			
			sb.append("\n");
			
			star = i < N ? star - 2 : star + 2; 
			gap = i < N ? gap + 1 : gap - 1;
		}
		
		System.out.print(sb.toString());
	}
}


