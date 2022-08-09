package algorithmProgrammers.java.level2;

public class Solution12913_v2 {
	public int solution(int[][] land) {
		int row = land.length, col = land[0].length;
		
		for(int i=1; i<row; i++) {
			for(int j=0; j<col; j++) {
				int max = 0;
				for(int k=0; k<col; k++) {
					if(k != j) { max = Math.max(max, land[i-1][k]); }
				}
				land[i][j] += max;
			}
		}
		
		int max = 0;
		for(int j=0; j<col; j++) {
			max = Math.max(max, land[row-1][j]);
		}
		
		return max;
    }
	
	public static void main(String[] args) {
		Solution12913_v2 sol = new Solution12913_v2();
//		int[][] land = { {1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1} };
		int[][] land = { {4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5} };
		int out = sol.solution(land);
		System.out.println(out);
	}
}
