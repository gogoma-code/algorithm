/**
 * [1차]캐시
 * https://programmers.co.kr/learn/courses/30/lessons/17680?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.LinkedList;

public class Solution17680 {
	public int solution(int cacheSize, String[] cities) {
		LinkedList<String> list = new LinkedList<String>();
		int totalTime = 0, time = 0;
		
		if(cacheSize == 0) {
			totalTime = cities.length * 5;
		} else {
			for(String city: cities) {
				city = city.toLowerCase();
				if(list.isEmpty()) {
					list.add(city);
					time = 5;
				} else {
					if(list.contains(city)) {
						list.remove(city);
						list.addLast(city);
						time = 1;
					} else {
						if(list.size() + 1 > cacheSize) {
							list.removeFirst();
						}
						list.add(city);
						time = 5;
					}
				}
				
				totalTime += time;
			}
		}
		
        return totalTime;
    }
	
	public static void main(String[] args) {
		Solution17680 sol = new Solution17680();
//		sol.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
//		sol.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
		sol.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
//		sol.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"});
	}
}
