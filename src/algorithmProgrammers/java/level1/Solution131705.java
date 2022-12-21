package algorithmProgrammers.java.level1;

public class Solution131705 {
	public int solution(int[] number) {
		int answer = 0;
		for(int i=0; i<number.length-2; i++) {
			for(int j=i+1; j<number.length-1; j++) {
				for(int k=j+1; k<number.length; k++) {
					if(number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution131705 sol = new Solution131705();
		sol.solution(new int[] {-2, 3, 0, 2, -5});
		sol.solution(new int[] {-3, -2, -1, 0, 1, 2, 3});
		sol.solution(new int[] {-1, 1, -1, 1});
	}
}
