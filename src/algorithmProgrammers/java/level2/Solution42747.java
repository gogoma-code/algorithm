/**
 * H-Index
 * https://programmers.co.kr/learn/courses/30/lessons/42747?language=java
 */
package algorithmProgrammers.java.level2;

import java.util.Arrays;

public class Solution42747 {
	public int solutionV1(int[] citations) {
        Arrays.sort(citations);
        
        int length = citations.length;
        int hIndex = length, hIndexMax = 0, hIndexCnt = 0;
        while(true) {
        	for(int i=length-1; i>=0; i--) {
        		if(citations[i] < hIndex) {
        			if(hIndex <= (length-1) - i) {
        				hIndexMax = hIndexMax < hIndex ? hIndex : hIndexMax;
        			}
        			hIndexCnt = 0;
        			break;
        		} else {
        			hIndexCnt++;
        		}
        	}
        	if(hIndexCnt > 0) {
        		hIndexMax = hIndex <= hIndexCnt ? hIndex : hIndexMax; 
        		hIndexCnt = 0;
        	}
        	hIndex--;
        	if(hIndex < hIndexMax) break;
        }
		
        return hIndexMax;
    }
	
	public int solutionV2(int[] citations) {
        Arrays.sort(citations);
        
        int max = 0;
        for(int i=citations.length-1; i>=0; i--) {
        	int min = (int)Math.min(citations[i], citations.length - i);
        	if(max < min) max = min;
        }
        
        return max;
    }
}
