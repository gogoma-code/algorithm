/***
 * 숫자 짝꿍
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128?language=java
 */
package algorithmProgrammers.java.level1;

//import java.util.Arrays;

public class Solution131128 {
//	public String solution(String X, String Y) {
//		char[] chars = X.length() <= Y.length() ? X.toCharArray() : Y.toCharArray();
//		StringBuilder sbStandard = X.length() > Y.length() ? new StringBuilder(X) : new StringBuilder(Y);
//		StringBuilder sbAnswer = new StringBuilder();
//		
//		for(char ch : chars) {
//			for(int j=0; j<sbStandard.length(); j++) {
//				if(ch == sbStandard.charAt(j)) {
//					sbAnswer.append(ch);
//					sbStandard.deleteCharAt(j);
//					break;
//				}
//			}
//		}
//		
//		char[] answers = sbAnswer.toString().toCharArray();
//		Arrays.sort(answers);
//		sbAnswer = new StringBuilder(String.valueOf(answers)).reverse();
//		
//		if(sbAnswer.length() == 0) return "-1";
//		else if(sbAnswer.charAt(0) == '0') return "0";
//		else return sbAnswer.toString();
//    }
	
	public String solution(String X, String Y) {
        int[][] numbers = new int[2][10];
        int lenX = X.length(), lenY = Y.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Math.max(lenX, lenY); i++) {
            if(i < lenX) numbers[0][X.charAt(i)-'0']++;
            if(i < lenY) numbers[1][Y.charAt(i)-'0']++;
        }
        
        System.out.println("num:\t[0][1][2][3][4][5][6][7][8][9]");
        System.out.println("------------------------------------");
        for(int i=0; i<numbers.length; i++) {
        	if(i==0) {
        		System.out.print("X:\t\t");
        	} else {
        		System.out.print("Y:\t\t");
        	}
        	for(int j=0; j<numbers[i].length; j++) {
        		System.out.print("[" + numbers[i][j] + "]");
        	}
        	System.out.println();
        }
        
        for(int i=9; i>=0; i--) {
        	int partner = Math.min(numbers[0][i], numbers[1][i]);
        	while(partner-- > 0) sb.append(i);
        }
        
        if(sb.length() == 0) return "-1";
        else if(sb.charAt(0) == '0') return "0";        
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Solution131128 sol = new Solution131128();
//		sol.solution("100", "2345"); //-1
//		sol.solution("100", "203045"); //0
//		sol.solution("100", "123450"); //10
//		sol.solution("12321", "42531"); //321
		sol.solution("5525", "1255"); //552
//		sol.solution("3403", "13203"); //330
//		sol.solution("1000000002", "20200"); //2000
	}
}