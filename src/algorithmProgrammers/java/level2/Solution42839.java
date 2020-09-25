/**
 * 소수 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/42839?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution42839 {
	static Set<Integer> set;
	public int solution(String numbers) {
		List<Character> picked = new ArrayList<Character>();
		boolean[] check = new boolean[numbers.length()];
		
		set = new HashSet<Integer>();
		pick(numbers.toCharArray(), picked, check);
		set = set.stream().filter(e -> isPrime(e)).collect(Collectors.toSet());
		
		return set.size();
    }
	
	public void pick(char[] numAry, List<Character> picked, boolean[] check) {		
		for(int i=0; i<numAry.length; i++) {			
			if(!check[i]) {
				check[i] = true;
				picked.add(numAry[i]);
				pick(numAry, picked, check);
				picked.remove(picked.size() - 1);
				check[i] = false;
			}
		}
		
		if(!picked.isEmpty()) {
			set.add(Integer.parseInt(picked.stream().map(e->e.toString()).reduce((acc, e) -> acc + e).get()));
		}
	}
	
	public boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime && num > 1;
	}
	
	public static void main(String[] args) {
		Solution42839 sol = new Solution42839();
//		sol.solution("17");
		sol.solution("0123");
	}
}
