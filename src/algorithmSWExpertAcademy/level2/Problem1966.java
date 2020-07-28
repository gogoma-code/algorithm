package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1966 { //숫자를 정렬하자
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=T; i++) {
			int N = Integer.parseInt(br.readLine());
			int numAry[] = new int[N];
			int j = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				numAry[j++] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(numAry);
			sb.append("#"+i+" ");
			for(int num : numAry) {
				sb.append(num + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
