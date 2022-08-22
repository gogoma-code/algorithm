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
		
		return getMBTIFull(map);
	}
	
	public String getMBTIFull(Map<String, Integer> map) {
		String[] mbtiGroup = { "RT", "CF", "JM", "AN" };
		String mbti = new String();
		for(String mg : mbtiGroup) {
			mbti += getMBTIPick(map, String.valueOf(mg.charAt(0)), String.valueOf(mg.charAt(1)));
		}
		
		return mbti;
	}
	
	public String getMBTIPick(Map<String, Integer> map, String first, String second) {
		int one = map.getOrDefault(first, 0) - map.getOrDefault(second, 0);
		return one < 0 ? second : first;
	}

	public static void main(String[] args) {
		Solution118666 sol = new Solution118666();
//		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
//		int[] choices = { 5, 3, 2, 7, 5 };

		String[] survey = { "TR", "RT", "TR" };
		int[] choices = { 7, 1, 3 };

		String mbti = sol.solution(survey, choices);
		System.out.println(mbti);
	}
}