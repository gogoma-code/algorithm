package algorithmProgrammers.level1;

import java.util.HashMap;

public class Solution42576 {
	public String solution(String[] participant, String[] completion) {
        String notRunner = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String runner : participant) map.put(runner, map.getOrDefault(runner, 0) + 1);
        for(String runner : completion) map.put(runner, map.get(runner) - 1);

        for(String runner : map.keySet()) {
            if(map.get(runner) != 0) {
                notRunner = runner;
                break;
            }
        }

        return notRunner;
    }
}
