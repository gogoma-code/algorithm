package algorithmProgrammers.level1;

public class Solution12943 {
	public int solution(int num) {
		int cnt = 0;
		while (cnt++ < 450) {
			if (num == 1)
				return cnt - 1;

			if (num % 2 == 0)
				num /= 2;
			else
				num = (num * 3) + 1;
		}

		return -1;
	}
}
