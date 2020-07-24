package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10250 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T!=0) {
			String[] input = br.readLine().split(" ");
			int height = Integer.parseInt(input[0]);
			int weight = Integer.parseInt(input[1]);
			int N = Integer.parseInt(input[2]);
			for(int i=1; i<=weight; i++) {
				int total_hw = i*height;
				if(total_hw >= N) {
					height = height - (total_hw - N);
					String w = (i >= 10) ? Integer.toString(i) : "0" + Integer.toString(i);
					bw.write(Integer.toString(height) + w + "\n");
					break;
				}
			}
			T--;
		}
		bw.flush();
		bw.close();
	}
}
