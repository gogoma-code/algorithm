/***
 * 수 정렬하기2
 * https://www.acmicpc.net/problem/2751
 */
package algorithmBaekjoon.level14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2751 {
	public static void main(String args[]) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] sortArr = new int[N];
		for(int i=0; i<N; i++) {
			sortArr[i] = Integer.parseInt(br.readLine());
		} // 정렬 전
		br.close();
		
		heapSort(sortArr);
		
		for(int sortAfter : sortArr) {
			bw.write(sortAfter + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void heapify(int[] data, int n, int i) {
		int parent = i;
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		
		if(left < n && data[parent] < data[left]) {
			parent = left;
		}
		
		if(right < n && data[parent] < data[right]) {
			parent = right;
		}
		
		if(i != parent) {
			int temp = data[parent];
			data[parent] = data[i];
			data[i] = temp;
			heapify(data, n, parent);
		}
	}
	
	public static void heapSort(int[] data) {
	    int n = data.length;
	 
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(data, n, i);
	    }
	 
	    for (int i = n - 1; i > 0; i--) {
	    	int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
	        heapify(data, i, 0);
	    }
	}
}
