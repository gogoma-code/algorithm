/**
 * 바탕화면 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/161990
 */
package algorithmProgrammers.java.level1;

public class Solution161990 {
	public int[] solution(String[] wallpaper) {
		int[] dragStart = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
		int[] dragEnd = new int[] {-1, -1};
		
		for(int i=0; i<wallpaper.length; i++) {
			int first = wallpaper[i].indexOf('#');
			int last = wallpaper[i].lastIndexOf('#');
			
			if(first >= 0) {
				dragStart[0] = Math.min(dragStart[0], i);
				dragStart[1] = Math.min(dragStart[1], first);
				dragEnd[0] = Math.max(dragEnd[0], i);
				dragEnd[1] = Math.max(dragEnd[1], last);
			}
		}
		
        return new int[] {dragStart[0], dragStart[1], (dragEnd[0]+1), (dragEnd[1]+1)};
    }
	
	public static void main(String[] args) {
		Solution161990 sol = new Solution161990();
//		sol.solution(new String[] {".#...", "..#..", "...#."});
//		sol.solution(new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."});
//		sol.solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
//		sol.solution(new String[] {"..", "#."});
//		sol.solution(new String[] {"#.", ".."});
//		sol.solution(new String[] {"....", "...#", ".##."});
	}
}
