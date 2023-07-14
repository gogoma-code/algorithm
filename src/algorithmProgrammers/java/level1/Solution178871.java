/**
 * 달리기 경주
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution178871 {
	public String[] solution_timeout1(String[] players, String[] callings) {
		List<String> list = Arrays.asList(players);		
		
		for(String call : callings) {
			int idx = list.indexOf(call);
			String forth = list.get(idx - 1);
			list.set(idx-1, call);
			list.set(idx, forth);
		}
		
        return list.toArray(String[]::new);
    }
	
	public String[] solution_timeout2(String[] players, String[] callings) {
		List<String> list = new ArrayList<>(Arrays.asList(players));		
		
		int target = list.indexOf(callings[0]) - 1;
		
		for(int i=1; i<callings.length; i++) {
			if(callings[i].equals(callings[i-1])) {
				target--;
			} else {
				String swap = list.remove(list.indexOf(callings[i-1]));
				list.add(target, swap);
				
				target = list.indexOf(callings[i]) - 1;
			}
		}
		
		String swap = list.remove(list.indexOf(callings[callings.length-1]));
		list.add(target, swap);
		
        return list.toArray(String[]::new);
    }
	
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);
		}
		
		for(String calling : callings) {
			int rank = map.get(calling);
			
			map.put(players[rank-1], rank);
			map.put(calling, rank-1);
			
			players[rank] = players[rank-1];
			players[rank-1] = calling;		 
		}
		
		return players;
	}
	
	public static void main(String[] args) {
		Solution178871 sol = new Solution178871();
		sol.solution(new String[] { "mumu", "soe", "poe", "kai", "mine" }, new String[] { "kai", "kai", "mine", "mine" });
	}
}
