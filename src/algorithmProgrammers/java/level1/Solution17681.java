/***
 * [1차] 비밀지도 
 * https://programmers.co.kr/learn/courses/30/lessons/17681?language=java
 */
package algorithmProgrammers.java.level1;

public class Solution17681 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		StringBuilder binaryValue = new StringBuilder();
		StringBuilder decodeValue = new StringBuilder();
		for(int i=0; i<n; i++) {
			int orValue = arr1[i] | arr2[i];
			binaryValue.append(Integer.toBinaryString(orValue));
			while(binaryValue.length() < n) {
				binaryValue.insert(0, "0");
			}
			
			for(int j=0; j<binaryValue.length(); j++) {
				Character getChar = binaryValue.charAt(j);
				if(getChar.equals('1')) {
					decodeValue.append("#");
				} else {
					decodeValue.append(" ");
				}
			}
			
			answer[i] = decodeValue.toString();
			
			decodeValue.setLength(0);
			binaryValue.setLength(0);
		}
		
		return answer;
	}
	
	public String[] solution2(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			String orBinaryStr = Integer.toBinaryString(arr1[i] | arr2[i]);
			while(orBinaryStr.length() < n) {
				orBinaryStr = " "+orBinaryStr;
			}
			orBinaryStr = orBinaryStr.replaceAll("1", "#").replaceAll("0", " ");
			answer[i] = orBinaryStr;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution17681 sol = new Solution17681();
		int n = 5;
		int[] inputs1 = {9,20,28,18,11};
		int[] inputs2 = {30,1,21,17,28};
		String[] outputs = sol.solution2(n, inputs1, inputs2);
		for(String s : outputs) {
			System.out.println(s);
		}
	}
}
