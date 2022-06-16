/***
 * 같은 숫자는 싫어 
 * https://programmers.co.kr/learn/courses/30/lessons/12906?language=java
 */
package algorithmProgrammers.java.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution12906 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int saveNum = -1;
        
        for (int a : arr) {
            if (saveNum != a) list.add(saveNum = a);
        }

        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }

        return newArr;
    }

    public int[] solution2(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int saveNum = -1;

        for (int a : arr) {
            if (saveNum != a) list.add(saveNum = a);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
