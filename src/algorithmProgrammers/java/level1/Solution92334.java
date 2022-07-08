/**
 * 신고 결과 받
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=java#
 */
package algorithmProgrammers.java.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution92334 {
	public int[] solution(String[] id_list, String[] report, int k) {
		List<String> id_aryList = Arrays.asList(id_list); // id_list의 index를 편하게 가져오려고 만드는 list
		Map<Integer, Set<Integer>> report_map = new HashMap<>(); // 신고 당하는 자가 기준인 map
		
		for (String re : report) {
			String[] res = re.split(" "); //res[0]: reporter | res[1]: reported
			int reporter = id_aryList.indexOf(res[0]); // 신고자의 index
			int reported = id_aryList.indexOf(res[1]); // 신고 당하는 자의 index
			
			Set<Integer> value = report_map.get(reported);
			if(value == null) { value = new HashSet<>(); }
			value.add(reporter);
			
			report_map.put(reported, value);
		}
		
		int[] answer = new int[id_list.length];
		for(Integer key : report_map.keySet()) {
			Set<Integer> value = report_map.get(key);
			if(value.size() >= k) { // k번 이상 신고당한 사람 
				for(Integer val : value) {
					answer[val]++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution92334 sol = new Solution92334();
		
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
		int k = 2;
		
		int[] outputs = sol.solution(id_list, report, k);
		for(int output : outputs) {
			System.out.println(output);
		}
	}
}
