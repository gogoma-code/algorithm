package algorithmProgrammers.level2;

public class Solution12945 {
	public int solution(int n) {
		if(n == 1 || n == 2) return 1;
		int f = solution(n-2) + solution(n-1);
		f %= 1234567;
		return f;
	}
}
