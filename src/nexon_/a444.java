package nexon_;

public class a444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abcba";
		 
		 
		 System.out.println(firstRepeatingLetter(s));
	}
	

    /*
     * Complete the function below.
     */
    static String firstRepeatingLetter(String s) {
    	String result = null; 
    	
    	int i = 0;
    	while(result == null && i < s.length())
    	{
    		char tmp = s.charAt(i);
    		
    		for(int j = i+1; j < s.length(); j++)
    		{
    			if(tmp == s.charAt(j))
    			{
    				result = tmp +"";
    				break;
    			}
    		}
    		
    		i++;
    	}
    	
    	return result;
    	
    }



}
