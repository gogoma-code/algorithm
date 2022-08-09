package algorithmProgrammers.java.level2;

public class Solution12913_v3 {
	int[][] land;
	int landRow, landCol;

	public int solution(int[][] land) {
		this.land = land;
		landRow = land.length;
		landCol = land[0].length;
		
		for(int i=0; i<landCol; i++) {
			dp(i, 1, i, land[0][i]);
		}
		
		int max = 0;
		for (int i = 0; i < landCol; i++) {
			max = Math.max(max, land[0][i]);
		}

		return max;
	}

	public void dp(int cur, int row, int col, int sum) {
		if (row == landRow) {
			land[0][cur] = Math.max(land[0][cur], sum);
		} else {
			for (int i = row; i < landRow; i++) {
				for (int j = 0; j < landCol; j++) {
					if (col != j) {
						dp(cur, i + 1, j, sum + land[i][j]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Solution12913_v3 sol = new Solution12913_v3();
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
//		int[][] land = { { 4, 3, 2, 1 }, { 2, 2, 2, 1 }, { 6, 6, 6, 4 }, { 8, 7, 6, 5 } };
		int out = sol.solution(land);
		System.out.println(out);
	}
}
