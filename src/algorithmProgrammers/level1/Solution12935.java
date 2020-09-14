/***
 * 제일 작은 수 제거하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
 */
package algorithmProgrammers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution12935 {
	public int[] solution(int[] arr) {
		if(arr.length <= 1) return new int[] {-1};
		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
			if(min > arr[i]) min = arr[i];
		}
		
		list.remove(list.indexOf(min));
		int[] newArr = new int[list.size()];
		for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);
		
		return newArr;
	}
}
