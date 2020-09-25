/**
 * 큰 수 만들기 
 * https://programmers.co.kr/learn/courses/30/lessons/42883?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution42883 {
	public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        //@1.
        int len = number.length();
        int remainNumber = len - k;
        int maxIdx = 0;
        
        while(remainNumber > 0) { //@2.
        	char maxChar = '0';
        	for(int i=maxIdx; i<=len-remainNumber && maxChar != '9'; i++) { //@3.
        		if(number.charAt(i) > maxChar) { //@4.
        			maxChar = number.charAt(i);
        			maxIdx = i;
        		}
        	}
        	//@5.
        	sb.append(maxChar);
        	maxIdx++;
        	remainNumber--;
        }
        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Solution42883 sol = new Solution42883();
		System.out.println(sol.solution("4177252841", 4));
	}
}


