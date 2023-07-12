/**
 * 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
package algorithmProgrammers.java.level1;

public class Solution135808 {
	public int solution2(int k, int m, int[] score) {
		int answer = 0;
		int putIn = 0, left = score.length, min = Integer.MAX_VALUE;
		while(left >= 0) {
			int[] max = new int[2];
			for(int i=0; i<score.length; i++) {
				if(max[1] < score[i]) {
					max[0] = i;
					max[1] = score[i];
				}
			}
			
			putIn++;
			left--;
			score[max[0]] = 0;
			if(max[1] < min) min = max[1];
			
			if(putIn == m) {
				putIn = 0;
				answer += min * m;
			}
		}
		
		System.out.println(answer);
        
        return answer;
    }
	
	public int solution3(int k, int m, int[] score) {
		int answer = 0, putIn = 0, left = score.length;
		while(left >= 0) {
			for(int i=0; i<score.length; i++) {
				if(score[i] == k) {
					putIn++;
					
					if(putIn == m) {
						putIn = 0;
						answer += k * m;
					}
				}
			}
			
			k--;
			left--;
		}
        
        return answer;
    }
	
	public int solution(int k, int m, int[] score) {
		int[] counts = new int[k+1];
		
		for(int s : score) counts[s]++;
		
		int answer = 0, left = 0;
		for(int i=counts.length-1; i>=0; i--) {
			counts[i] += left;
			
			answer += i * m * (counts[i] / m);
			left = counts[i] % m;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution135808 sol = new Solution135808();
		sol.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1});
//		sol.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
	}
}
