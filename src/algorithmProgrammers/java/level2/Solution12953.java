/**
 * N개의 최소공배수 
 * https://programmers.co.kr/learn/courses/30/lessons/12953?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.HashMap;
import java.util.Map;

public class Solution12953 {
	public int solution(int[] arr) {
		int lcm = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			lcm = getLcm(lcm, arr[i]);
		}
		
		return lcm;
	}
	
	public int getGcd(int a, int b) {
		int tmp;
		while(b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}
		
		return a;
	}
	
	public int getLcm(int a, int b) {		
		return a * b / getGcd(a, b);
	}
	
	public int solution2(int[] arr) {
		int lcm = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			lcm = getLcm2(lcm, arr[i]);
		}
		return lcm;
	}
	
	public int getLcm2(int a, int b) {		
		Map<Integer, Integer> pf1 = getPrimeFactorization(a);
		Map<Integer, Integer> pf2 = getPrimeFactorization(b);
		
		for(int key : pf1.keySet()) {
			if( pf2.containsKey(key) ) {
				pf2.put(key, Math.max(pf1.get(key), pf2.get(key)));
			} else {
				pf2.put(key, pf1.get(key));
			}
		}
		
		int lcm = 1;
		for(int key : pf2.keySet()) {
			lcm *= Math.pow(key, pf2.get(key));
		}
		
		return lcm;
	}
	
	public Map<Integer, Integer> getPrimeFactorization(int num) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=2; i<=Math.sqrt(num); i++) {
			while( num % i == 0 ) {
				map.put(i, map.getOrDefault(i, 0) + 1);
				num /= i;
			}
		}
		if( num != 1 ) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		return map;
	}
}
