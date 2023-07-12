/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370
 * 개인정보 수집 유효기간
 */
package algorithmProgrammers.java.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Solution150370 {
	/*
	public int[] solution(String today, String[] terms, String[] privacies) {
		Calendar cal_today = Calendar.getInstance();
		cal_today.setTime(stringToDate(today));
		Map<String, Integer> termsMap = Arrays.stream(terms)
				.map(i -> i.split(" "))
				.collect(Collectors.toMap(s -> s[0], s-> Integer.parseInt(s[1])));
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<privacies.length; i++) {
			String[] privacie = privacies[i].split(" ");
			Calendar cal_privacie = Calendar.getInstance();
			cal_privacie.setTime(stringToDate(privacie[0]));
			cal_privacie.add(Calendar.MONTH, termsMap.get(privacie[1]));
			
			if(cal_today.compareTo(cal_privacie) >= 0) {
				list.add(i+1);
			}
		}
		
        return list.stream().mapToInt(i -> i).toArray();
    }
	
	public Date stringToDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date d = null;
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return d;
	}
	*/
	
	public int[] solution(String today, String[] terms, String[] privacies) {
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate todayDate = LocalDate.parse(today, dtf);
		
		int[] termsAll = new int[26];
		for(String term: terms) {
			String[] ts =  term.split(" ");
			termsAll[ts[0].charAt(0)-'A'] = Integer.parseInt(ts[1]);
		}
		
		List<Integer> answer = new ArrayList<>();
		for(int i=0; i<privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");
			LocalDate privacyDate = LocalDate.parse(privacy[0], dtf).plusMonths(termsAll[privacy[1].charAt(0)-'A']).minusDays(1);
			
			if (privacyDate.isBefore(todayDate)) {
                answer.add(i+1);
            }
		}
		
		
		return answer.stream().mapToInt(i -> i).toArray();
	}
	
	
	public static void main(String[] args) {
		Solution150370 sol = new Solution150370();
		sol.solution("2022.05.19", new String[] {"A 6", "B 12", "C 3"}, new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
		sol.solution("2020.01.01", new String[] {"Z 3", "D 5"}, new String[] {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
	}
}
