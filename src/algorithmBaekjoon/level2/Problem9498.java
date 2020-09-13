/***
 * 시험 성적 
 * https://www.acmicpc.net/problem/9498
 */
package algorithmBaekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9498 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		if(0<=score && score<=100) {
			char grade = 'F';
			switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade ='C';
				break;
			case 6:
				grade ='D';
				break;
			}
			System.out.println(grade);
		}
	}
}
