package kakaoBlind_201810;

public class chattingTest1 {
	

	
//Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sl = new Solution();
		String[] inputStr = {		
		"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
		};
		for(String s : sl.solution(inputStr))
		    System.out.println(s);
		
		
	}

}
