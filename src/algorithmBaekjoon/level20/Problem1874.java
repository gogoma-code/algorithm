package algorithmBaekjoon.level20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> inputList = new ArrayList<Integer>();
		int i;

		for (i = 0; i < n; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
		}

		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (i = 1; i <= n; i++) {
			stack.push(i);
			sb.append("+\n");
			while (!stack.isEmpty() && !inputList.isEmpty() && stack.peek().equals(inputList.get(0))) {
				stack.pop();
				inputList.remove(0);
				sb.append("-\n");
			}
		}
		 
		if(! stack.isEmpty()) {
			sb.setLength(0);
			sb.append("NO\n");
		}
		System.out.print(sb.toString());
	}
}
