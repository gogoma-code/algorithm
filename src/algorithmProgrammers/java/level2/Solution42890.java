/**
 * 후보키
 * https://programmers.co.kr/learn/courses/30/lessons/42890?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution42890 {
	Set<String> set;
	public int solution(String[][] relation) {
        int col = relation[0].length;
        boolean[] check = new boolean[col];
        List<Integer> picked = new ArrayList<>();
        
        set = new HashSet<>();
        for(int i=1; i<=col; i++) {
        	pick(relation, picked, check, i, 0);
        }
        
        return set.size();
    }
	
	/**
	 * 
	 * @param relation
	 * @param picked : 선택한 인덱스 번호들
	 * @param check 
	 * @param num : 조합을 1개부터 순서대로 하기 위해 지정한 수 (ex: {0}, {1}, {2}, {0,1}, {0,2}, {1,2}, {0,1,2})
	 * @param i
	 */
	public void pick(String[][] relation, List<Integer> picked, boolean[] check, int num, int i) {
		//조합을 순서대로 picked에 삽입 및 제거
		for( ; i<relation[0].length; i++) {
			if(num <= picked.size()) break;
			if(!check[i]) {
				check[i] = true;
				picked.add(i);
				pick(relation, picked, check, num, i+1);
				picked.remove(picked.size() - 1);
				check[i] = false;
			}
		}
		
		//조합의 수와 지정한 수가 같을 경우 후보키 선정 로직 통과
		if(picked.size() == num) {
			//유일성 체크 (중복되지 않는 집합의 수와 레코드의 길이가 같다면 유일성 만족)
			Set<String> pickedSet = new HashSet<>();
			for(int j=0; j<relation.length; j++) {
				String str = new String();
				for(int idx : picked) {
					str += relation[j][idx];
				}
				pickedSet.add(str);
			}
			if(pickedSet.size() == relation.length) {
				//최소성 체크 (부분집합 여부를 확인하여 부분집합이 아닌 경우 최소성 만족)
				boolean candidateFlag = true;
				for(String s : set) {
					List<String> candiList1 = Arrays.asList(s.split(""));
					List<String> candiList2 = picked.stream()
												.map(p->String.valueOf(p))
												.collect(Collectors.toList());
					
					if(candiList2.containsAll(candiList1)) {
						candidateFlag = false;
						break;
					}
				}
				if(candidateFlag) {
					String str = new String();
					for(int idx : picked) {
						str += String.valueOf(idx);
					}
					set.add(str);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Solution42890 sol = new Solution42890();
		sol.solution(new String[][] {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "3"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}});
//		sol.solution(new String[][] {{"a", "1", "4"}, {"2", "1", "5"}, {"a", "2", "4"}});
//		sol.solution(new String[][] {{"a", "b", "c"}, {"1", "b", "c"}, {"a", "b", "4"}, {"a", "5", "c"}});
//		sol.solution(new String[][] {{"a", "1", "4"}, {"2", "1", "5"}, {"a", "2", "4"}});
	}
}
