/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution68644 {
	public int[] solution(int[] numbers) {		
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				sum = numbers[i] + numbers[j];
				if(list.isEmpty() || !list.contains(sum)) {
					list.add(sum);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		int size = 0;
		for(int l : list) {
			answer[size++] = l;
		}
        
		Arrays.sort(answer);
        return answer;
    }
	
	public int[] solution2(int[] numbers) {
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
	
	public int[] solution3(int[] numbers) {
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] answer = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		int i = 0;
		while(iter.hasNext()) {
			answer[i++] = iter.next();
		}
		
		return answer;
    }
	
	
	public static void main(String[] args) {
		Solution68644 sol = new Solution68644();
		sol.solution2(new int[] {2,1,3,4,1});
	}
}
