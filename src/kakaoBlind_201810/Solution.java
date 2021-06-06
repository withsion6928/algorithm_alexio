package kakaoBlind_201810;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {


	public String[] solution(String[] record) {
		String[] answer = {};
		List<String> answerList = new ArrayList<>();
		Map<String, String> user = new HashMap<String, String>();
		for (String str : record) {

			String firstUr = getUidStr(str, 0);
			String usersecondUr = getUidStr(str, 1);
			List<String> ee = new ArrayList<>();
			if (!user.containsKey(firstUr)) {
				ee = new ArrayList<>();
			} 
			if (str.contains("Enter ")) {
				String message = firstUr + "¥‘¿Ã µÈæÓø‘Ω¿¥œ¥Ÿ.";
				user.put(firstUr, usersecondUr);
				answerList.add(message);
				
			} else if (str.contains("Leave ")) {
				String message = usersecondUr + "¥‘¿Ã ≥™∞¨Ω¿¥œ¥Ÿ.";
				ee.add(message);
				answerList.add(message);
			} else if (str.contains("Change ")) {
				user.put(firstUr, usersecondUr);
			}
		}
		List<String> answerList2 = new ArrayList<>();
		for(String str : answerList) {
			String id = getUidStr(str, 2);
			answerList2.add(str.replaceAll(id, user.get(id)));
		}
		answer = new String[answerList2.size()];
		return answerList2.toArray(answer);
	}

	public String getUidStr(String str, int gubun) {
		String result = "";
		// gubun 0 id, gubun 1 nickname
		switch (gubun) {
		case 0:
			result = str.substring(str.indexOf(" "), str.lastIndexOf(" "));
			break;
		case 1:
			result = str.substring(str.lastIndexOf(" "));
			break;
		case 2:
			result = str.substring(0, str.indexOf(" "));
			result = result.replaceAll("¥‘¿Ã", "");
			break;
		}

		return result.trim();
	}
}