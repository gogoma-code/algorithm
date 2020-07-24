package algorithmBaekjoon.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1085 { //직사각형에서 탈출
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xMin = w-x < x ? w-x : x;
		int yMin = h-y < y ? h-y : y;
		int ans = xMin < yMin ? xMin : yMin;
		
		System.out.print(ans);
	}
}

