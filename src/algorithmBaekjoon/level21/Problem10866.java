package algorithmBaekjoon.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Problem10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String kind = "";
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deQ = new ArrayDeque<Integer>();
		while(n-- != 0) {
			kind = br.readLine();
			
			if(kind.startsWith("push_front")) {
				deQ.addFirst(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("push_back")) {
				deQ.addLast(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("pop_front")) {
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollFirst() + "\n");
			} else if(kind.startsWith("pop_back")) {
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollLast()+ "\n");
			} else if(kind.equals("size")) {
				sb.append(deQ.size() + "\n");
			} else if(kind.equals("empty")) {
				sb.append(deQ.isEmpty() ? "1\n" : "0\n");
			} else if(kind.equals("front")) {
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getFirst() + "\n");
			} else if(kind.equals("back")) {
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getLast() + "\n");
			} else {
				sb.append("error\n");
			}
		}
		System.out.println(sb.toString());
	}
}
