package algorithmProgrammers.java.level2;

public class Solution12913 {
	int max = 0;
	public int solution(int[][] land) {
		
		eatGround(land, 0, -1, 0);
		
        return max;
    }
	
	public void eatGround(int[][] land, int row, int cur, int sum) {
		if(row == land.length && max < sum) {
			max = sum;
			return;
		}
		
		for(int i=row; i<land.length; i++) {
			for(int j=0; j<land[0].length; j++) {
				if(j != cur) {
					eatGround(land, i+1, j, sum + land[i][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Solution12913 sol = new Solution12913();
//		int[][] land = { {1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1} };
		int[][] land = { {4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5} };
		int out = sol.solution(land);
		System.out.println(out);
	}
}
