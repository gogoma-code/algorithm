/**
 * k진수에서 소수 개수 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92335?language=java
 */
package algorithmProgrammers.java.level2;

public class Solution92335 {
	public int solution(int n, int k) {
		String n_to_k = changeNotation(n, k);

		int count = 0;
		String[] splitZero = n_to_k.split("0");
		for(String str : splitZero) {
			if(!str.trim().isEmpty()) {
				long num = Long.parseLong(str);
				if (isPrime(num)) count++;
			}
		}

		return count;
	}
	
	public int solution2(int n, int k) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int ins = n % k;
			if(ins != 0) {
				sb.insert(0, n % k);
			} else {
				if(sb.length() > 0) {
					long num = Long.parseLong(sb.toString());
					if (isPrime(num)) count++;
				}
				sb.setLength(0);
			}
			n /= k;
		}
		if(sb.length() > 0) {
			long num = Long.parseLong(sb.toString());
			if (isPrime(num)) count++;
		}
		
		return count;
	}
	
	public String changeNotation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.insert(0, n % k);
			n /= k;
		}
		
		return sb.toString();
	}

	public boolean isPrime(long num) {
		boolean isPrime = true;
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return num <= 1 ? false : isPrime;
	}
}
