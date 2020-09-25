/***
 * 나누어 떨어지는 숫자 배열 
 * https://programmers.co.kr/learn/courses/30/lessons/12910?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution12910 {
  public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) list.add(arr[i]);
		}
		
		if(list.isEmpty()) return new int[] {-1}; 
		
		Collections.sort(list);
		int[] newArr = new int[list.size()];
		for(int i=0; i<list.size(); i++) newArr[i] = list.get(i);
		
		return newArr;
	}
}
