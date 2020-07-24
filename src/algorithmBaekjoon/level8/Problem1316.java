package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1316 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int inputCnt = Integer.parseInt(br.readLine());
		int groupCnt = 0; // 그룹단어 수
		
		for(int i=0; i<inputCnt; i++) {
			String str = br.readLine();
			
			String alphabet = ""; // 그룹단어의 알파벳을 정렬할 변수
			boolean flag = true; //그룹단어인지 체크할 플래그
			for(int j=0; j<str.length(); j++) {
				String str_one = String.valueOf(str.charAt(j));
				if(alphabet.contains(str_one)) {
					if((alphabet.length()-1) != alphabet.lastIndexOf(str_one)) {
						flag = false;
						break;
					}
				} else {
					alphabet += str_one;
				}
			}
			if(flag)
				groupCnt++;
		}
		bw.write(groupCnt+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
