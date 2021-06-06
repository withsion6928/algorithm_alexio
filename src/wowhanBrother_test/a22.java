package wowhanBrother_test;

import java.util.*;

/**
3
1 3
5 6
2 4
 */

class a22 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();

			
			
			List<Integer> list =  new ArrayList<>(); 
			for (int i = 0; i < n; i++) {
				int a = s.nextInt();
				int b = s.nextInt();

				// ������� �ۼ��� �ּ���
				list.addAll(sol(a,b));
			}
			Collections.sort(list);
			Map<Integer, Integer> map = new HashMap<Integer,Integer>();
			
			for(Integer i : list)
			{
				if(map.containsKey(i))
					map.put(i, map.get(i) + 1);
				else
					map.put(i, 1);
			}

			int i = 0;
			int pairTmp=0; 

			for(Integer key : map.keySet())
			{
				
				int value = map.get(key);
				if(i == 0)
					prinft("-",Integer.toString(value),0);
				else if(i == map.size() - 1)
					prinft(Integer.toString(key),"+",0);
				else if( value == 1 || value % 2 ==0)
				{
					int gubun = value == 1 ? 0 : 1;
					if(pairTmp == 0)
						pairTmp = key;
					else
					{
						prinft( Integer.toString(pairTmp), Integer.toString(key), gubun);
						pairTmp = 0;
					}
				}
				
				i++;
			}
			
		}
		
		
	}
	public static List<Integer> sol(int a, int b)
	{
		List<Integer> list =  new ArrayList<>(); 
		
		for(int i = a; i <= b ; i ++)
			list.add(i);
		
		return list; 
	}
	public static void prinft(String a, String b, int gubun)
	{
		StringBuffer buf = new StringBuffer();
		
		switch(gubun)
		{
		case 0:
			buf.append("(");
			buf.append(a);
			buf.append(", ");
			buf.append(b);
			buf.append(")");
			break;
		case 1:
			buf.append("[");
			buf.append(a);
			buf.append(", ");
			buf.append(b);
			buf.append("]");
			break;
		}
		System.out.println( buf.toString());
		
	}
}
