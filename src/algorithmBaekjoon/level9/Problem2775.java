package algorithmBaekjoon.level9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2775 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T != 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[] room = new int[n];
			for(int i=0; i<n; i++) {
				room[i] = i+1;
			}
			for(int i=1; i<=k; i++) {
				for(int j=0; j<n; j++) {
					if(j==0) {
						room[j] = 1;
					} else {
						room[j] = room[j-1] + room[j];
					}
				}
			}
			bw.write(room[n-1] + "\n");
			T--;
		}
		bw.flush();
		bw.close();
	}
}
