package wowhanBrother_test2;

import java.util.*;

/**
 * 
 * @author mtJu
 *
 6 1 1 1
 4 0 2 2
 */
class a1_slove {

  public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			String in ="hoto.jpg, Warsaw, 2013-09-05 14:08:15 \n"+
			"john.png, London, 2015-06-20 15:13:22\n"+
			"myFriends.png, Warsaw, 2013-09-05 14:07:13\n"+
			"Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"+
			"pisatower.jpg, Paris, 2015-07-22 23:59:59\n"+
			"BOB.jpg, London, 2015-08-05 00:02:03\n"+
			"notredame.png, Paris, 2015-09-01 12:00:00\n"+
			"me.jpg, Warsaw, 2013-09-06 15:40:22\n"+
			"a.png, Warsaw, 2016-02-13 13:33:50\n"+
			"b.jpeg, Warsaw, 2016-01-02 15:12:22\n"+
			"c.jpg, Warsaw, 2016-01-02 14:34:30\n"+
			"d.jpg, Warsaw, 2016-01-02 15:15:01\n"+
			"e.png, Warsaw, 2016-01-02 09:49:09\n"+
			"f.png, Warsaw, 2016-01-02 10:55:32\n"+
			"g.jpg, Warsaw, 2016-02-29 22:13:11";
			
			System.out.println(solution(in));
		}
  }
	    public static String solution(String S) {
	        // write your code in Java SE 8
	    	
	    	ArrayList<clazz> dataList = new ArrayList<>();
	    	Map<String, clazz> resultMap = new HashMap<>();

	    	String[] array; 
	    	array = S.split("\n");
	    	int idx = 0;
	    	for(String a : array)
	    	{	    		
	    		clazz data = new clazz();
	    		String[] brray = new String[3];
	    		brray = a.split(",");
	    		data.extension = brray[0].trim().substring(brray[0].indexOf('.'), brray[0].length());
	    		data.city = brray[1].trim();
	    		data.time = brray[2].trim();
	    		data.idx = ++idx;
	    		resultMap.put(data.time, data);
	    		dataList.add(data);
	    		
	    	}
	    	Map<String, ArrayList<String>> cityPerMap = new HashMap<>();
	    	List<String> tmpList;
	    	for(clazz idxc : dataList)
	    	{
	    		if(!cityPerMap.containsKey(idxc.city))
	    		{
	    			tmpList = new ArrayList<String>();
	    			tmpList.add(idxc.time);
	    			cityPerMap.put(idxc.city, (ArrayList<String>) tmpList);
	    		}
	    		else
	    		{
	    			cityPerMap.get(idxc.city).add(idxc.time);
	    			Collections.sort(cityPerMap.get(idxc.city));
	    		}
	    	}
	    	for(ArrayList<String> list : cityPerMap.values())
	    	{
	    		int i = 1; 
	    		for( String e : list)
	    		{
	    			String suffix ;
	    			if(list.size() >= 10) 
	    				suffix = String.format("%02d" ,i++);
	    			else
	    				suffix = Integer.toString(i++);
	    			clazz data =  resultMap.get(e);
	    			data.postFix = suffix;
	    			resultMap.put(e, data);
	    		}
	    	}
	    	StringBuilder resultBuilder = new StringBuilder();

	    	for(clazz data : dataList)
	    	{
	    		resultBuilder.append(data.city);
	    		resultBuilder.append(data.postFix);
	    		resultBuilder.append(data.extension);
	    		resultBuilder.append("\n");
	    	}
	    	return resultBuilder.toString();
	    }
	    
	    
	    public static class clazz{
	    	int idx;
	    	String extension;
	    	String city;
	    	String time;
	    	String postFix;
	    }
	    
}
