/**
 * 다음 큰 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12911?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution12911 {
	public int solution(int n) {
		String nToBinary = Integer.toBinaryString(n);
		int nCount = 0;
		for(int i=0; i<nToBinary.length(); i++) {
			if(nToBinary.charAt(i) == '1') nCount++;
		}
		
		
		int tmp = 0, tmpCount = 0;
		for(tmp = n+1; nCount != tmpCount; tmp++) {
			String tmpToBinary = Integer.toBinaryString(tmp);
			tmpCount = 0;
			for(int i=0; i<tmpToBinary.length(); i++) {
				if(tmpToBinary.charAt(i) == '1') tmpCount++;
			}
		}
		
		return tmp-1;
	}
}
