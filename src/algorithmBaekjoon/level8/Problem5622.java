package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5622 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		br.close();
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '0') {
				sum += 11;
			} else if(ch == '1') {
				sum += 2;
			} else {
				sum += getNumber(ch) + 1;
			}
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
	
	public static int getNumber(char ch) {
		int number = 0;
		switch(ch) {
		case 'A':
		case 'B':
		case 'C':
			number = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			number = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			number = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			number = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			number = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			number = 7;
			break;
		case 'T':
		case 'U':
		case 'V':
			number = 8;
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			number = 9;
			break;
		default :
			break;
		}
		return number;
	}
}
