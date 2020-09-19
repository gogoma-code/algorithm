/**
// * 다리를 지나는 트럭 
 * https://programmers.co.kr/learn/courses/30/lessons/42583?language=java
 */
package algorithmProgrammers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution42583 {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 0, sum = 0, i = 0;
		Queue<Integer> timeQ = new LinkedList<Integer>();
		Queue<Integer> truckQ = new LinkedList<Integer>();
		
		while(true) {
			if(!truckQ.isEmpty() && timeQ.peek() == time) {
				timeQ.poll();
				sum -= truckQ.poll();
			}
			
			if(i < truck_weights.length && sum + truck_weights[i] <= weight) {
				timeQ.offer(time + bridge_length);
				truckQ.offer(truck_weights[i]);
				sum += truck_weights[i];
				i++;
			}
			
			time++;
			if(timeQ.isEmpty()) { break; }
		}
		
		return time;
    }
	
	public static void main(String[] args) {
		solution(2, 10, new int[] {7,4,5,6}); //8
		solution(3, 10, new int[] {7,4,5,6}); //11
		solution(2, 10, new int[] {4,5,4,6}); //6
		solution(2, 10, new int[] {7,4,5,4,6}); //8
		solution(100, 100, new int[] {10}); //101
		solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}); //110
		solution(1, 2, new int[] {1,1,1}); //4
		solution(1, 1, new int[] {1,1,1}); //4
		solution(4, 2, new int[] {1,1,1,1}); //10
		solution(3, 3, new int[] {1,1,1}); //6
		solution(3, 1, new int[] {1,1,1}); //10
		solution(3, 1, new int[] {1,1,1,1,1}); //16
		solution(5, 5, new int[] {1,1,1,1,1,2,2}); //14
		solution(7, 7, new int[] {1,1,1,1,1,3,3}); //18
		solution(5, 5, new int[] {1,1,1,1,1,2,2,2,2}); //19
		solution(5, 5, new int[] {2,2,2,2,1,1,1,1,1}); //19
		
	}
}