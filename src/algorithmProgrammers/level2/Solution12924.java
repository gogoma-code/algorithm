package algorithmProgrammers.level2;

public class Solution12924 {
	public int solution(int n) {
		int count = 0, sum = 0, tmp = 0;
		for(int i=1; i<n/2+1; i++) {
			sum = 0;
			tmp = i;
			while(sum < n) sum += tmp++;
			if(sum == n) count++;
		}
		
		return count+1;
	}
}
