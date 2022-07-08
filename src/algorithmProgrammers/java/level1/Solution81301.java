package algorithmProgrammers.java.level1;

import java.util.Arrays;
import java.util.List;

public class Solution81301 {
	public int solution(String s) {
		List<String> alphabet = Arrays.asList( "zero","one","two","three","four","five","six","seven","eight","nine");
		
		StringBuilder answer = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		for(char ch : s.toCharArray()) {			
			if(ch >= '0' && ch <= '9') { answer.append(ch); }
			else { temp.append(ch); }
			
			int num = alphabet.indexOf(temp.toString());
			if(num >= 0) {
				temp.setLength(0);
				answer.append(num);
			}
		}
		
        return Integer.parseInt(answer.toString());
    }
	
	public int solution2(String s) {
		String[] numbers = { "0","1","2","3","4","5","6","7","8","9" };
		String[] alphabets = { "zero","one","two","three","four","five","six","seven","eight","nine" };
		for(int i=0; i<=9; i++) {
			s = s.replaceAll(alphabets[i], numbers[i]);
		}
		
		return Integer.parseInt(s);
    }
}
