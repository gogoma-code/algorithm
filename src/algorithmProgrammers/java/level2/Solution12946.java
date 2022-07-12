/**
 * 하노이의 탑
 * https://school.programmers.co.kr/learn/courses/30/lessons/12946?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Stack;

public class Solution12946 {
	public int[][] solution(int n) {
		int count = (int)Math.pow(2, n) - 1;
		int[][] answer = new int [count][2];
		int index = 0;
		Stack<Integer> hanoi = new Stack<>();
		
		boolean flag = true;
		int from = 1, by = 2, to = 3;		
		hanoi.add(n); hanoi.add(from); hanoi.add(by); hanoi.add(to);
		
		while(!hanoi.isEmpty()) {
			to = hanoi.pop(); by = hanoi.pop(); from = hanoi.pop(); n = hanoi.pop();
			
			if( n == 1 ) {
				answer[index++] = new int[] { from, to };
				flag = false;
			} else {
				if(flag) {
					hanoi.add(n); hanoi.add(from); hanoi.add(by); hanoi.add(to);
					hanoi.add(n-1); hanoi.add(from); hanoi.add(to); hanoi.add(by);
				}  else {
					answer[index++] = new int[] { from, to };
					hanoi.add(n-1); hanoi.add(by); hanoi.add(from); hanoi.add(to);
					flag = true;
				}
			}
		}
		
        return answer;
    }
	
	public int[][] solution2(int n) {
		int count = (int)Math.pow(2, n) - 1;
		int[][] answer = new int [count][2];
		
		Hanoi hanoi = new Hanoi(answer);
		hanoi.hanoi(n, 1, 2, 3);
		
		return hanoi.getHanoiAry();
	}
}

class Hanoi {
	int index = 0;
	int[][] hanoiAry;
	
	public Hanoi(int[][] hanoiAry) {
		this.hanoiAry = hanoiAry;
	}
	
	public void hanoi(int n, int from, int by, int to) {
		if(n==1) {
			hanoiAry[index++] = new int[] { from, to };
		} else {
			hanoi(n-1, from, to, by); // 1->3->2
			hanoiAry[index++] = new int[] { from, to };
			hanoi(n-1, by, from, to); // 2->1->3
		}		
	}
	
	public int[][] getHanoiAry() {
		return this.hanoiAry;
	}
}
