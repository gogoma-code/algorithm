package algorithmSWExpertAcademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1976 { //1976. 시각 덧셈
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=T; i++) {
			String hourStrAry[] = br.readLine().split(" ");
			int hour = Integer.parseInt(hourStrAry[0]) + Integer.parseInt(hourStrAry[2]);
			int minute = Integer.parseInt(hourStrAry[1]) + Integer.parseInt(hourStrAry[3]);
			
			if(minute >= 60) {
				minute -= 60;
				hour += 1;
			}
			if(hour > 12) {
				hour -= 12;
			}
			sb.append("#"+i+" "+hour+" "+minute+"\n");
		}
		System.out.print(sb.toString());
	}
}