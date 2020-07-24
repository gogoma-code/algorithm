package algorithmBaekjoon.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem1157 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt[] = new int[26];
		String input = br.readLine().toUpperCase();
		// 입력 받은 알파벳을 모두 대문자로 치환
		
		// 가장 큰 알파벳 구하기
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			cnt[ch - 'A']++;
		}
		int max = 0;
		for(int i=0; i<cnt.length; i++) {
			if(cnt[max] < cnt[i]) 
				max = i;
		}
		int[] tmpCnt = cnt;
		Arrays.sort(tmpCnt);
		if(tmpCnt[tmpCnt.length-1] == tmpCnt[tmpCnt.length-2]) {
			bw.write("?");
		} else {
			bw.write(max+'A');
		}
		bw.flush();
	}
}
