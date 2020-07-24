package algorithmBaekjoon.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2439 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		if(1<=input && input<=100) {
			char[] starnblank = new char[input];
			for(int i=0; i<input; i++)
				starnblank[i] = ' ';
			for(int i=input-1; i>=0; i--) {
				starnblank[i] = '*';
				System.out.println(starnblank);
			}
		}
	}
}
