/**
 * 신규 아이디 추천
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410?language=java 
 */
package algorithmProgrammers.java.level1;

public class Solution72410 {
	public String solution(String new_id) {
		// Level 1
		new_id = new_id.toLowerCase(); 
		
		// Level 2
		new_id = new_id.replaceAll("[^\\w-_.]*", "");
		
		// Level 3
		new_id = new_id.replaceAll("\\.{2,}", ".");
		
		// Level 4
		new_id = new_id.replaceAll("^\\.|\\.$", "");
		
		// Level 5
		if(new_id.equals("")) new_id = "a";
		
		// Level 6
		if(new_id.length() > 15) new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
		
		// Level 7
		if(new_id.length() <= 2) {
			char ch = new_id.charAt(new_id.length()-1);
			while(new_id.length() <= 3) {
				new_id += ch;
			}
		}		
		
        return new_id;
    }
}
