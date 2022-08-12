package algorithmProgrammers;

public class Example {
	public static void main(String[] args) {
		int n = 7;
		int postPattern = n & -n;
		int smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
		System.out.println(postPattern);
		System.out.println(smallPattern);
		
		System.out.println(Integer.toBinaryString(15));
	}
}
