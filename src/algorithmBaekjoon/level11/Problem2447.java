/***
 * 별 찍기 - 10
 * https://www.acmicpc.net/problem/2447
 */
package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2447 { 
	private static char[][] starArr; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		starArr = new char[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(starArr[i], ' ');
		}
		
		printStar(0, 0, N);
		for(int i=0; i<N; i++) {
			System.out.println(starArr[i]);
		}
	}
	
	public static void printStar(int row, int col, int n) {
		int div = n/3; 
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i!=1 || j!=1) {
					if(n==1) starArr[row + (i*div)][col + (j*div)] = '*'; 
					else printStar(row + (i*div), col + (j*div), div);
				}
			}			
		}		
	}
}
