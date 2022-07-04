/***
 * 최소직사각형
 * https://programmers.co.kr/learn/courses/30/lessons/86491?language=java
 */

package algorithmProgrammers.java.level1;

class Solution86491 {
    public int solution(int[][] sizes) {
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for(int[] size : sizes) {
            maxX = Math.max(maxX, Math.max(size[0], size[1]));
            maxY = Math.max(maxY, Math.min(size[0], size[1]));
        }
        
        return maxX * maxY;
    }
}