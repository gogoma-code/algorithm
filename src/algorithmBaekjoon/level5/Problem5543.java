package algorithmBaekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5543 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int minBurger = Integer.MAX_VALUE, minDrink = Integer.MAX_VALUE; 
		while(cnt++ < 5) {
			int input = Integer.parseInt(br.readLine());
			if(cnt < 4) {
				if(input < minBurger) minBurger = input;
			} else {
				if(input < minDrink) minDrink = input;
			}
		}
		
		System.out.print(minBurger + minDrink - 50);
	}
}
