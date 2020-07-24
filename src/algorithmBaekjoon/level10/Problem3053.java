package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3053 { //택시 기하학
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int radius = Integer.parseInt(br.readLine());
		System.out.printf("%.6f\n", Math.PI * Math.pow(radius, 2));
		System.out.printf("%.6f", 2*Math.pow(radius, 2));
	}
}
