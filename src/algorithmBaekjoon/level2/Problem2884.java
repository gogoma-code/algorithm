package algorithmBaekjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int timeH = Integer.parseInt(st.nextToken());
		int timeM = Integer.parseInt(st.nextToken());
		
		if(timeM < 45) {
			timeM += 15;
			timeH = timeH > 0 ? timeH - 1 : 23;
		} else {
			timeM -= 45;
		}
		
		System.out.println(timeH + " " + timeM);
	}
}
