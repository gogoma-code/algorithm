/***
 * 나머지 
 * https://www.acmicpc.net/problem/3052
 */
package algorithmBaekjoon.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mods[] = new int[10];
		int count = mods.length;
		for(int i=0; i<10; i++) {
			int mod = Integer.parseInt(br.readLine()) % 42;
			for(int j=0; j<i; j++) {
				if(mods[j] == mod) {
					count--;
					break;
				}
			}
			mods[i] = mod;
		}
		
		System.out.print(count);
	}
}
