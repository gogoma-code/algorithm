package algorithmBaekjoon.level20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		int lIndex = 0, rIndex = 0;
		while(T-- != 0) {			
			StringBuilder sb = new StringBuilder();
			sb.append(br.readLine());
			
			if(sb.charAt(0) == ')' || sb.charAt(sb.length()-1) == '(') {
				bw.write("NO\n");
			} else {
				for(int i=0; i<sb.length(); i++) {					
					while(sb.length() != 0) {
						lIndex = sb.lastIndexOf("(");
						rIndex = sb.indexOf(")", lIndex);
						
						if(lIndex == -1 || rIndex == -1) break;
						
						sb.replace(rIndex, rIndex+1, "");
						sb.replace(lIndex, lIndex+1, "");
					}
				}
				if(sb.length() == 0) bw.write("YES\n");
				else bw.write("NO\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
