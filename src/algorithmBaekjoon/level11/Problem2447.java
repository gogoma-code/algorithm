package algorithmBaekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2447 { //�� ��� - 10
	private static char[][] starArr; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//#1. �� ���� �迭 �ʱ�ȭ
		starArr = new char[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(starArr[i], ' ');
		}
		
		//#2. �� ��� & ���
		printStar(0, 0, N);
		for(int i=0; i<N; i++) {
			System.out.println(starArr[i]);
		}
	}
	
	public static void printStar(int row, int col, int n) {
		int div = n/3; //#3. 27 -> 9 -> 3 (������� ã�ư� �� �ְ�)
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i!=1 || j!=1) {
					//#4. ���� n==1 �̸� �� �ε����� ���� ��� �׷��� ������ n==1�� �� �� ���� �ε����� ã�ư���.
					if(n==1) starArr[row + (i*div)][col + (j*div)] = '*'; 
					else printStar(row + (i*div), col + (j*div), div);
				}
			}			
		}		
	}
}
