package algorithmProgrammers.java.level1;

public class Solution159994 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";
		int idx1 = 0, idx2 = 0;
		for(String g : goal) {
			if(idx1 < cards1.length && cards1[idx1].equals(g)) {
				idx1++;
			} else if(idx2 < cards2.length && cards2[idx2].equals(g)) {
				idx2++;
			} else {
				answer = "No";
				break;
			}
		}
        
        return answer.isEmpty() ? "Yes" : "No";
    }
	
	public static void main(String[] args) {
		Solution159994 sol = new Solution159994();
		
		sol.solution(new String[] { "i", "drink", "water" }, new String[] { "want", "to" }, new String[] { "i", "want", "to", "drink", "water" });
//		sol.solution(new String[] { "i", "water", "drink" }, new String[] { "want", "to" }, new String[] { "i", "want", "to", "drink", "water" });
	}
}
