/**
 * 카펫
 * https://programmers.co.kr/learn/courses/30/lessons/42842?language=java
 */
package algorithmProgrammers.level2;

//#1. brown = x * y - yellow
//#2. yellow = (x-2) * (y-2)
class Solution42842 {
	public int[] solution(int brown, int yellow) {
        int y = 3;
        int x = (brown + yellow) / y;
         
        while((x-2) * (y-2) != yellow) {
        	x = (brown + yellow) / ++y;
        }
        
        return new int[] {x, y};
	}
	
	public static void main(String[] args) {
		Solution42842 sol = new Solution42842();
//		sol.solution(10, 2);
//		sol.solution(8, 1);
		sol.solution(24, 24);
	}
}
