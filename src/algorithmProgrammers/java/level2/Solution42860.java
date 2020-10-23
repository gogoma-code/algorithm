package algorithmProgrammers.java.level2;

public class Solution42860 {	
	public int solution(String name) {		
		boolean visit[] = new boolean[name.length()];
		int[] findAry = {0, 0}; //idx, move
		int sum = 0;
		
		while(true) {
			int idx = findAry[0];
			int move = findAry[1];
			if(idx == -1) break;
			
			visit[idx] = true;
			char ch = name.charAt(idx);
			sum += Math.min(Math.abs('A' - ch), Math.abs('Z' - ch + 1));
			sum += move;
			findAry = findPos(visit, name, idx);			
		}
		
		return sum;
    }
	
	public int[] findPos(boolean[] visit, String name, int idx) {
		int pos = 0, move = 0;
		int right = idx;
		int left = idx;
		while(true) {
			right = right + 1 < name.length() ? right + 1 : right;
			left = left - 1 < 0 ? name.length() - 1 : left - 1;
			move++;
			if(left == idx) {
				pos = -1;
				break;
			}
			if(!visit[right] && name.charAt(right) != 'A') {
				pos = right;
				break;
			}
			if(!visit[left] && name.charAt(left) != 'A') {
				pos = left;
				break;
			}
		}
		
		return new int[] {pos, move};
	}
	
	public static void main(String[] args) {
		Solution42860 sol = new Solution42860();
//		sol.solution("JEROEN"); //56
//		sol.solution("BAAABB"); //5
//		sol.solution("BAAACD"); //8
//		sol.solution("AZAAAZ"); //5
		sol.solution("JAN"); //23
	}
}
