/**
 * 햄버거 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution133502 {
	public int solution(int[] ingredient) {
		List<Integer> list = new ArrayList<>();
		int idx = 0, answer = 0;
		int[] burgers = new int[] { 1, 2, 3, 1 };
		for (int i = 0; i < ingredient.length; i++) {
			list.add(ingredient[i]);

			if (burgers[idx] == ingredient[i]) {
				idx++;
				
				if (idx == 4) {
					answer++;
					while (idx != 0) {
						idx--;
						list.remove(list.size() - 1);
					}

					int first = list.lastIndexOf(1);
					if (first >= 0) {
						for (int j = first; j < list.size(); j++) {
							if (burgers[idx] != list.get(j)) {
								idx = 0;
								break;
							}

							idx++;
						}
					}
				}
			} else {
				idx = (ingredient[i] == 1) ? 1 : 0;
			}
		}

		return answer;
	}
	
	public int solution2(int[] ingredient) {
		int[] ingredientAry = new int[ingredient.length];
		int idx = 0, answer = 0;
		for(int ing : ingredient) {
			ingredientAry[idx] = ing;
			idx++;
			
			if(idx >= 4) {
				if(ingredientAry[idx-4] == 1 && ingredientAry[idx-3] == 2 && ingredientAry[idx-2] == 3 && ingredientAry[idx-1] == 1) {
					idx -= 4;
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution133502 sol = new Solution133502();
		int[] ingredient = new int[] { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
//		int[] ingredient = new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2};
//		int[] ingredient = new int[] {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
//		int[] ingredient = new int[] {1, 3, 2, 3, 1};
		sol.solution2(ingredient);
	}
}
