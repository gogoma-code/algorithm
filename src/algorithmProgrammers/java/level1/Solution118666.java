package algorithmProgrammers.java.level1;

import java.util.HashMap;
import java.util.Map;

class Solution118666 {
	public String solution(String[] survey, int[] choices) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < survey.length; i++) {
			String sv = new String();
			int choice = choices[i] - 4;
			if (choice < 0) {
				sv = String.valueOf(survey[i].charAt(0));
				choice = Math.abs(choice);
			} else if (choice > 0) {
				sv = String.valueOf(survey[i].charAt(1));
			}
			if (!sv.isEmpty()) map.put(sv, map.getOrDefault(sv, 0) + choice);
		}
		
		
		return getMBTI(map);
	}
	
	public String getMBTI(Map<String, Integer> map) {
		String[] mbtiGroup = { "RT", "CF", "JM", "AN" };
		String mbti = new String();
		for(String mg : mbtiGroup) {
			String first = String.valueOf(mg.charAt(0));
			String second = String.valueOf(mg.charAt(1));
			int score = map.getOrDefault(first, 0) - map.getOrDefault(second, 0);
			String pick = score < 0 ? second : first;
			
			mbti += pick;
		}
		
		return mbti;
	}
}