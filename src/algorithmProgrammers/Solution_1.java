package algorithmProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_1 {
	public static void main(String[] args) {
		Solution_1 sol = new Solution_1();
		System.out.println(sol.solution(10, new int[] {3, 9, 10}, new int[] {3, 8, 9}));
	}
	
    public int solution(int n, int[] lost, int[] reserve) {
		int okMember = n - lost.length; // @1
		
		List<Integer> lostList = new ArrayList<Integer>(); // @2
		for (int i : lost) lostList.add(i);

		List<Integer> reserveList = new ArrayList<Integer>(); // @3
		for (int i : reserve) reserveList.add(i);
		
        for(int i=0; i<lostList.size(); i++) { // @4
			for(int j=0; j<reserveList.size(); j++) {
				if(lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
                    i--;
					okMember++;
					break;
				}
			}
		}
    
		for (int i = 0; i < lostList.size(); i++) { // @5
			int lostNum = lostList.get(i);
			for (int j = 0; j < reserveList.size(); j++) {
				int reserveNum = reserveList.get(j);
				if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
					reserveList.remove(j);
					okMember++;
					break;
				}
			}
		}

		return okMember;
	}
}
