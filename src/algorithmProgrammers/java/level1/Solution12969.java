/***
 * 직사각형 별찍기 
 * https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution12969 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(i -> sb.append("*"));
        IntStream.range(0, b).forEach(i -> System.out.println(sb.toString()));
    }
	
	/*
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
    */
}
