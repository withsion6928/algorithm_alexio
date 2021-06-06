package nexon_;

import java.util.ArrayList;
import java.util.HashMap;

public class a1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String names[] = {  "{}[]()",
                 "{[}]",
              };
		 
		 
		 braces(names);
	}
	

    /*
     * Complete the function below.
     */
    static String[] braces(String[] values) {
    	String[] result = new String[values.length];
    	HashMap<Character, Character> map = new HashMap<Character, Character>();
    	map.put('{','}');
    	map.put('(',')');
    	map.put('[',']');
    	
    	ArrayList<Character> in = new ArrayList<Character>();
    	ArrayList<Character> out = new ArrayList<Character>();
    	
        for(int i = 0 ; i < values.length ; i++)
        {
            int aCnt = 0;
            int bCnt = 0;
            boolean flg = true;
            String strCase = values[i];
            in.clear();out.clear();
            for(int j = 0; j < strCase.length(); j++)
            {
            	if( map.containsKey(strCase.charAt(j)))
            	{
            		in.add(strCase.charAt(j));
            		aCnt++;
            	}
            	else {
            		out.add(strCase.charAt(j));
            		bCnt++;
            	}
            		
            }
            for(int k = 0; k < aCnt; k++)
            {
            	if(map.get(in.get(k)) != out.get(k))
            		flg = false;
            }
            
            if(aCnt == bCnt  && flg)
            {
            	result[i] = "YES";
            }
            else
            {
            	result[i] = "NO";
            }
            System.out.println(result[i]);
        }
        return result;
    }


}
