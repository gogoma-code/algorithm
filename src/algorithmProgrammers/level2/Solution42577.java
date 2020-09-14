/***
 * 전화번호 목록 
 * https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
 */
package algorithmProgrammers.level2;

public class Solution42577 {
	public boolean solution(String[] phone_book) {
		String phone = new String("");
		for(int i=0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book.length; j++) { 
				if(i!=j && phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		
		return true;
	}
}
