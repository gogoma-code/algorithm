package algorithmProgrammers.level2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution42839_V2 {
	public int solution(String numbers) {
        Set<Integer> set = new HashSet<Integer>();
        permutation("", numbers, set);
        System.out.println(set);
        return set.stream().filter(e -> isPrime(e)).collect(Collectors.toSet()).size();
    }
	
	public void permutation(String prefix, String str, Set<Integer> set) {
        int len = str.length();
        if(!prefix.equals("")) { set.add(Integer.valueOf(prefix)); }
        for (int i = 0; i < len; i++) {
        	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, len), set);
        }
    }
	
	public boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime && num > 1;
	} 
	
	public static void main(String[] args) {
		Solution42839_V2 sol = new Solution42839_V2();
//		System.out.println(sol.solution("17"));
		System.out.println(sol.solution("012"));
//		System.out.println(sol.solution("011"));
	}
}
