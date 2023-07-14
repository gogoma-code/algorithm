/**
 * 공원 산책
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */
package algorithmProgrammers.java.level1;

public class Solution172928 {
	public int[] solution(String[] park, String[] routes) {
		boolean[][] parkFull = new boolean[park.length][park[0].length()];
				
		int x = 0, y = 0;
		int xWall = parkFull.length, yWall = parkFull[0].length;
		for(int i=0; i<park.length; i++) {
			char[] cols = park[i].toCharArray();
			for(int j=0; j<cols.length; j++) {
				if(cols[j] == 'O') parkFull[i][j] = true;
				else if(cols[j] == 'S') {
					parkFull[i][j] = true;
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println("wall : " + xWall + ", " + yWall);
		System.out.println(x + ", " + y);
		for(String route : routes) {
			String[] r = route.split(" ");
			int step = Integer.parseInt(r[1]);
			int target = 0, temp = 0;
			
			System.out.println("#######################################");
			System.out.println(r[0] + " : " + step);
			switch(r[0]) {
			case "E":
				temp = y;
				while(target++ < step && y+1 < yWall && parkFull[x][y+1]) y++;
				if(target-1 != step) y = temp;
				break;
			case "W":
				temp = y;
				while(target++ < step && y-1 >= 0 && parkFull[x][y-1]) y--;
				if(target-1 != step) y = temp;
				break;
			case "S":
				temp = x;
				while(target++ < step && x+1 < xWall && parkFull[x+1][y]) x++;
				if(target-1 != step) x = temp;
				break;
			case "N":
				temp = x;
				while(target++ < step && x-1 >= 0 && parkFull[x-1][y]) x--;
				if(target-1 != step) x = temp;
				break;
			}
			
			System.out.println(x + ", " + y);
		}
		
        return new int[] {x, y};
    }
	
	public static void main(String[] args) {
		Solution172928 sol = new Solution172928();
//		sol.solution(new String[] {"SOO","OOO","OOO"}, new String[] {"E 2","S 2","W 1"});
//		sol.solution(new String[] {"SOO","OXX","OOO"}, new String[] {"E 2","S 2","W 1"});
//		sol.solution(new String[] {"OSO","OOO","OXO","OOO"}, new String[] {"E 2","S 3","W 1"});
//		sol.solution(new String[] {"OOO", "OSO", "OOO", "OOO"}, new String[] {"N 2", "S 2"});
	}
}
