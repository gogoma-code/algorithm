/**
 * 튜플
 * https://programmers.co.kr/learn/courses/30/lessons/64065?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution64065 {
	public int[] solution(String s) {
		List<String[]> list = new ArrayList<String[]>();
		s = s.substring(1, s.length()-1);
		String str = new String();
		for(char ch : s.toCharArray()) {
			if(ch == '{') {
				str = "";
			} else if(ch == '}') {
				String[] split = str.split(",");
				list.add(split);
			} else {
				str += ch;
			}
		}
		
		list.sort((a,b) -> {return a.length - b.length;});
		
		list.sort(new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return o1.length - o2.length;
			}
		});
		
		List<String> answerList = new ArrayList<String>();		
		for(String[] l : list) {
			for(int i=0; i<l.length; i++) {
				if(answerList.isEmpty() || !answerList.contains(l[i])) {
					answerList.add(l[i]);
				}
			}
		}
		
		
		int[] answer = new int[answerList.size()];
		int i = 0;
		for(String ans : answerList) {
			answer[i++] = Integer.parseInt(ans);
		}
		
        return answer;
    }
	
	public int[] solutionV2(String s) {
		Set<String> set = new HashSet<String>();
		String[] split = s.replaceAll("[{|}]", " ").trim().split(" , ");
		Arrays.sort(split, (o1, o2)->{return o1.length()-o2.length();});
		
		int[] answer = new int[split.length];
		int idx = 0;
		for(int i=0; i<split.length; i++) {
			for(String str : split[i].split(",")) {
				if(set.add(str)) {
					answer[idx++] = Integer.parseInt(str);
				}
			}
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		Solution64065 sol = new Solution64065();
//		sol.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
//		sol.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
//		sol.solution("{{20,111},{111}}");
//		sol.solution("{{123}}");
//		sol.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		
		sol.solutionV2("{{4,2,3},{3},{2,3,4,1},{2,3}}");
	}
}
