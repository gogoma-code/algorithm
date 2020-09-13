/***
 * 스택 
 * https://www.acmicpc.net/problem/20828
 */
package algorithmBaekjoon.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		
		for(int i=0; i<n; i++) {
			input[i] = br.readLine();
		}
		
		printStackRun(input);
	}

	// 입력한 문자열 체크해서 합당하는 스택 메소드 실행
	public static void printStackRun(String[] str) {
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length; i++) {
			if(str[i].startsWith("push")) {
				int number = Integer.parseInt(str[i].split(" ")[1]);
				stack.push(number);
			} else if (str[i].equalsIgnoreCase("pop")) {
				sb.append(stack.empty() ? -1 : stack.pop());
			} else if (str[i].equalsIgnoreCase("top")) {
				sb.append(stack.empty() ? -1 : stack.get(stack.size()-1));
			} else if (str[i].equalsIgnoreCase("size")) {
				sb.append(stack.size());
			} else if (str[i].equalsIgnoreCase("empty")) {
				sb.append(stack.empty() ? 1 : 0);				
			} else {
				System.out.println("fail");
			}
			
			if(!str[i].startsWith("push")) sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
