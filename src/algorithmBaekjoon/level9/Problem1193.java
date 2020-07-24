package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1193 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();
		int i = 1, j = 1;
		boolean flag = true;
		int turn = 2;
		while(X!=1) {
			if(flag == true) {
				j++;
				if(i>1)
					i--;
			} 
			else {
				i++;
				if(j>1)
					j--;
			}
			if(i == turn || j == turn) {
				flag = !flag;
				++turn;
			}
			--X;
		}
		System.out.println(i + "/" + j);
	}
}
