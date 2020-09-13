/***
 * 단어 정렬 
 * https://www.acmicpc.net/problem/1181
 */
package algorithmBaekjoon.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		List<String> words = new ArrayList<String>(set);
		Collections.sort(words, new Comparator<String>() {
			public int compare(String obj1, String obj2) {
				if (obj1.length() == obj2.length()) {
					return obj1.compareToIgnoreCase(obj2);
				} else {
					return obj1.length() - obj2.length();
				}
			}
		});

		// 출력
		for (String word : words)
			System.out.println(word);
	}
}
