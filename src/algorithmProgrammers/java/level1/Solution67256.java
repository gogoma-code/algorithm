/***
 * 키패드 누르기 
 * https://programmers.co.kr/learn/courses/30/lessons/67256?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.Arrays;
import java.util.List;

public class Solution67256 {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		List<Integer> leftKey = Arrays.asList(1, 4, 7);
		List<Integer> midKey = Arrays.asList(2, 5, 8, 0);
		List<Integer> rightKey = Arrays.asList(3, 6, 9);
		
		String putLeftHand = "L", putRightHand = "R";
		int leftHand = 3, rightHand = 3;
		int number = 0;
		for(int i=0; i<numbers.length; i++) {
			number = numbers[i];
			
			if(leftKey.contains(number)) { //왼쪽키 = 왼손
				putLeftHand = "L";
				leftHand = leftKey.indexOf(number);
				sb.append("L");
			} else if(rightKey.contains(number)) { //오른쪽키 == 오른손
				putRightHand = "R";
				rightHand = rightKey.indexOf(number);
				sb.append("R");
			} else { //중앙키
				String putMid = new String();
				int midIndex = midKey.indexOf(number);
				int leftDist = Math.abs(midIndex - leftHand);
				int rightDist = Math.abs(midIndex - rightHand);
				
				leftDist = putLeftHand.equals("M") ? leftDist-1 : leftDist;
				rightDist = putRightHand.equals("M") ? rightDist-1 : rightDist;
				
				if(leftDist < rightDist) putMid = "L"; //왼손이 더 가까울 때
				else if(leftDist > rightDist) putMid = "R"; //오른손이 더 가까울 때
				else putMid = hand.equals("left") ? "L" : "R"; //왼손과 오른손의 길이가 같을 때, 왼손잡이인지? 오른손잡이인지?
				
				if(putMid.equals("L")) {
					putLeftHand = "M";
					leftHand = midKey.indexOf(number);
					sb.append("L");
				} else {
					putRightHand = "M";
					rightHand = midKey.indexOf(number);
					sb.append("R");
				}
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution67256 sol = new Solution67256();
		int numbers[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(sol.solution(numbers, hand));
	}
}
