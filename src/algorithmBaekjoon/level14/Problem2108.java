package algorithmBaekjoon.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
			sum += numbers.get(i);
		}

		Collections.sort(numbers);

		// 평균값
		int avg = (int) Math.round((double) sum / N);

		int range = 0; // 범위
		int half = 0; // 중앙값
		if (numbers.size() == 1) {
			range = 0;
			half = 0;
		} else {
			int min = numbers.get(0);
			int max = numbers.get(numbers.size() - 1);
			range = max - min;
			half = (N & 1) == 1 ? N / 2 + 1 : N / 2;
			half--;
		}
		
		// 최빈값
		Map<Integer, Integer> modeNumbers = new HashMap<Integer, Integer>();
		modeNumbers.put(numbers.get(0), 1);
		if (numbers.size() > 1) {
			for (int i = 1; i < numbers.size(); i++) {
				int keyValue = numbers.get(i);
				if (modeNumbers.containsKey(keyValue))  {
					modeNumbers.put(keyValue, modeNumbers.get(keyValue) + 1);
				} else {
					modeNumbers.put(keyValue, 1);
				}
			}
		}
		
		Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		
		Iterator<Integer> it = sortByValue(modeNumbers).iterator();
		int maxVal = Integer.MIN_VALUE;
		while(it.hasNext()){
			int tempKey =  (Integer) it.next();
			int tempVal = modeNumbers.get(tempKey);
			if(maxVal < tempVal) maxVal = tempVal;
			if(maxVal != tempVal) {
				break;
			}
			newMap.put(tempKey, tempVal);
		}

		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>(newMap);
		it = tm.keySet().iterator();
		int mode = it.next();
		if(it.hasNext()) mode = it.next();
		
		System.out.println(avg);
		System.out.println(numbers.get(half));
		System.out.println(mode);
		System.out.println(range);
	}

	public static List<Integer> sortByValue(final Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(map.keySet());
		Collections.sort(list, new Comparator<Object>() {
			@SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable<Object>) v1).compareTo(v2);
			}
		});

		Collections.reverse(list); // 주석시 오름차순
		return list;
	}
}
