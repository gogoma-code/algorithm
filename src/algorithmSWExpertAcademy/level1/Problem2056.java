/**
 * 2056. 연월일 달력
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QLkdKAz4DFAUq&categoryId=AV5QLkdKAz4DFAUq&categoryType=CODE
 */
package algorithmSWExpertAcademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem2056 {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy/MM/dd");
		for(int i=1; i<=T; i++) {
			String dateStr = new String(br.readLine());
			try {
				dateFormat.setLenient(false);
				Date date = dateFormat.parse(dateStr);
				sb.append("#"+i+" "+transFormat.format(date) + "\n");
			} catch(ParseException e) {
				sb.append("#"+i+" -1\n");
			}
		}
		System.out.println(sb.toString());
	}
}
