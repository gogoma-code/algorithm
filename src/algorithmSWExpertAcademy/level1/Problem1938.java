package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1938 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr[] = br.readLine().split(" ");
		int a = Integer.parseInt(numStr[0]);
		int b = Integer.parseInt(numStr[1]);
		
		System.out.println((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b));
	}
}
