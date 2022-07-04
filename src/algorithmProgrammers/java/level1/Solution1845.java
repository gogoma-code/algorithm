package algorithmProgrammers.java.level1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1845 {
	public int solution(int[] nums) {
		return Math.min(nums.length / 2, IntStream.of(nums).boxed().collect(Collectors.toSet()).size());
	}

	public int solution2(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			set.add(num);
		}

		return Math.min(nums.length / 2, set.size());
	}
}
