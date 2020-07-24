package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2447 { //별 찍기 - 10
	private static char[][] starArr; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//#1. 별 찍을 배열 초기화
		starArr = new char[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(starArr[i], ' ');
		}
		
		//#2. 별 찍기 & 출력
		printStar(0, 0, N);
		for(int i=0; i<N; i++) {
			System.out.println(starArr[i]);
		}
	}
	
	public static void printStar(int row, int col, int n) {
		int div = n/3; //#3. 27 -> 9 -> 3 (순서대로 찾아갈 수 있게)
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i!=1 || j!=1) {
					//#4. 만약 n==1 이면 현 인덱스에 별을 찍고 그렇지 않으면 n==1이 될 때 까지 인덱스를 찾아간다.
					if(n==1) starArr[row + (i*div)][col + (j*div)] = '*'; 
					else printStar(row + (i*div), col + (j*div), div);
				}
			}			
		}		
	}
}
